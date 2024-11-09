package codes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Scrollbar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CommonCodes extends JFrame {
    static int i = 0;
    static JLabel label,algorithmLabel;
    static ImageIcon imageLabel,algorithmImageLabel;
    static TimerTask task = new TimerTask() {

        @Override
        public void run() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'run'");
        }
        
    };
    static Timer timer;
    public CommonCodes(String title)
    {
        setTitle(title);
        setBounds(250, 10, 1000, 800);
        setIconImage(new ImageIcon("Images/Logo1.png").getImage());
        getContentPane().setBackground(Color.white);
        setLayout(null);  
        getContentPane().add(new Scrollbar(Scrollbar.VERTICAL));
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static JButton buttonLayout(String text,int x,int y,int width,int height,Color bg,Color fg,String name,int style,int size)
    {
        JButton button = new JButton(text);
        button.setBounds(x,y,width,height); 
        button.setBackground(bg);
        button.setForeground(fg);
        button.setFont(new Font(name,style,size));
        return button;
    }
    public static JButton backButtonLayout()
    {
        JButton backButton = new JButton(new ImageIcon("Images/back1.jpg"));
        backButton.setBounds(30,30,50,50); 
        return backButton;
    }
    public static JButton quizButtonLayout()
    {
        JButton quizButton = new JButton(new ImageIcon("Images/Quiz.jpg"));
        quizButton.setBounds(850, 10, 100, 75);
        return quizButton;
    }
    public static JLabel imageSlider(String[] path,int x,int y,int w,int h)
    {
        imageLabel = new ImageIcon(path[0]);
        label = new JLabel();
        
        timer = new Timer();
        task = new TimerTask() {
            
            public void run()
            {
                imageLabel = new ImageIcon(path[i]);
                i += 1;
                if(i >= path.length)
                {
                    i = 0;
                }
                label.setIcon(imageLabel);
            }
        };
        label.setBounds(x,y,w,h);
        timer.scheduleAtFixedRate(task,0,1500); 
        return label;
    }
    public static void cancelTask()
    {
        task.cancel();
    }
    public static JLabel algorithmSetter(String path,int x,int y,int w,int h)
    {
        algorithmImageLabel = new ImageIcon(path);
        algorithmLabel = new JLabel();
        algorithmLabel.setIcon(algorithmImageLabel);
        algorithmLabel.setBounds(x,y,w,h);
        return algorithmLabel;
    }
    public static JLabel headingLabelSetter(String heading,int x, int y, int w,int h)
    {
        JLabel headingLabel = new JLabel(heading);
        headingLabel.setFont(new Font(Font.SERIF, Font.BOLD, 35));
        headingLabel.setBounds(x, y, w, h);
        return headingLabel;
    }
    
    public static void quizZone(String tableName)
    {
         JFrame frame = new JFrame();
         frame.setBounds(400, 200, 800, 400);
         frame.setIconImage(new ImageIcon("Images/Logo1.png").getImage());
         frame.setVisible(true);
         frame.setTitle("Quiz Zone");
         JLabel label = new JLabel(new ImageIcon("Images/Quiz2.jpg"));
         label.setBounds(0, 0, 900, 400);
         frame.add(label);
         try{
            String url = "jdbc:mysql://localhost:3306/DataStructuresQuiz";
            String user = "root";
            String pass = "SL$12";
            Connection con = DriverManager.getConnection(url,user, pass);
            if(con != null)   System.out.println("Connection Successful");
            int score = 0;
            ResultSet rs;
            Statement st = con.createStatement();
            //JOptionPane.showMessageDialog(null, "This is the time to check your knowledge!......", "Welcome", JOptionPane.PLAIN_MESSAGE);
            rs = st.executeQuery("SELECT * from " + tableName + " ORDER BY RAND() LIMIT 5;");
            String[] correctAnswers = new String[5];
            String[] questions = new String[5];
            String[] explanations = new String[5];
            int i = 0;
                while(rs.next())
                {
                    String[]  answers = {rs.getString(6),rs.getString(3),rs.getString(4),rs.getString(5)};
                    String correct = rs.getString(7);
                    String question = rs.getString(2);
                    Object userAnswer = JOptionPane.showInputDialog(null, question, "Question ",
                    JOptionPane.QUESTION_MESSAGE,null,answers,null);
                    if(userAnswer == null)
                    {
                        frame.dispose();
                        return;
                    }
                    else if(userAnswer.equals(correct))
                    {
                        score++;
                    }
                    correctAnswers[i] = correct;
                    questions[i] = question;
                    explanations[i] = rs.getString(8);
                    i++;
                }
            JOptionPane.showMessageDialog(null,"You scored " + score + " out of " + 5 , "Score card", JOptionPane.INFORMATION_MESSAGE);

            int option = JOptionPane.showOptionDialog(null, "Do you want to review the correct answers ? ", 
            "Review", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null,null);

                if(option == 0)
                {
                    for (int  k= 0; k < 5; k++)
                        {
                            
                            JOptionPane.showMessageDialog(null,questions[k] + "\nCorrect answer is \n" + correctAnswers[k] + "\n Explanation : \n" + explanations[k],
                        "Question with answer",JOptionPane.INFORMATION_MESSAGE);
                        }

                }
                if(option == 1)
                {
                    frame.dispose();
                }
            }
            catch(SQLException e){
                System.out.println(e);
            }
            frame.dispose();
    }
}
