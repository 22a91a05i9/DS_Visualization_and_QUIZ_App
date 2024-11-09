package treesAndGraphs.graphs.algorithms;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import treesAndGraphs.graphs.Graphs;

public class Algorithms extends CommonCodes implements ActionListener {
    JButton backButton,primsButton, dijkstrasButton, kruskalsButton,warshallsButton;
    JLabel heading;
    public Algorithms(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        heading = headingLabelSetter("Algorithms", 380, 10, 400, 50);
        add(heading);
        primsButton = buttonLayout("Prim's Algorithm",250,80,400,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        primsButton.addActionListener(this);
        add(primsButton);
        kruskalsButton = buttonLayout("Kruskal's Algorithm",250,230,400,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        kruskalsButton.addActionListener(this);
        add(kruskalsButton);
        dijkstrasButton = buttonLayout("Dijkstra's Algorithm",250,380,400,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        dijkstrasButton.addActionListener(this);
        add(dijkstrasButton);
        warshallsButton = buttonLayout("Warshall's Algorithm",250,530,400,50,Color.GREEN,Color.MAGENTA, Font.SERIF,Font.BOLD,25);
        warshallsButton.addActionListener(this);
        add(warshallsButton);

    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new Graphs("Data Structures/Trees and Graphs/Graphs");
        }
        if(event.getSource() == primsButton){
            new Prims("Data Structures/Trees and Graphs/Graphs/Algorithms/Prim's Algorithm");
        }
        if(event.getSource() == kruskalsButton){
            new Kruskals("Data Structures/Trees and Graphs/Graphs/Algorithms/Kruskal's Algorithm");
        }
        if(event.getSource() == dijkstrasButton){
            new Dijkstras("Data Structures/Trees and Graphs/Graphs/Algorithms/Dijkstra's Algorithm");
        }
        if(event.getSource() == warshallsButton){
            new Warshalls("Data Structures/Trees and Graphs/Graphs/Algorithms/Warshall's Algorithm");
        }
        dispose();
    }
}
