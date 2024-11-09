package sortingAlgorithms;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import codes.CommonCodes;
import codes.DataStructures;
import sortingAlgorithms.Bubble.BubbleSort;
import sortingAlgorithms.Insertion.InsertionSort;
import sortingAlgorithms.Merge.MergeSort;
import sortingAlgorithms.Quick.QuickSort;
import sortingAlgorithms.Radix.RadixSort;
import sortingAlgorithms.Selection.SelectionSort;

public class Sorting extends CommonCodes implements ActionListener {
    JButton backButton,selectionSortButton, bubbleSortButton, insertionSortButton, mergeSortButton, quickSortButton, radixSortButton;
    JLabel heading;
    public Sorting(String title)
    {
        super(title);
        backButton = backButtonLayout();
        backButton.addActionListener(this);
        add(backButton);
        heading = headingLabelSetter("Sorting Algorithms", 310, 10, 400, 50);
        add(heading);
        selectionSortButton = buttonLayout("Selection Sort",90,150,320,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        selectionSortButton.addActionListener(this);
        add(selectionSortButton);
        bubbleSortButton = buttonLayout("Bubble Sort",550,230,320,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        bubbleSortButton.addActionListener(this);
        add(bubbleSortButton);
        insertionSortButton = buttonLayout("Insertion Sort",90,300,320,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        insertionSortButton.addActionListener(this);
        add(insertionSortButton);
        mergeSortButton = buttonLayout("Merge Sort",550,380,320,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        mergeSortButton.addActionListener(this);
        add(mergeSortButton);
        quickSortButton = buttonLayout("Quick Sort",90,450,320,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        quickSortButton.addActionListener(this);
        add(quickSortButton);
        radixSortButton = buttonLayout("Radix Sort",550,530,320,50,Color.YELLOW,Color.RED, Font.SERIF,Font.BOLD,25);
        radixSortButton.addActionListener(this);
        add(radixSortButton);
        
    }
    public void actionPerformed(ActionEvent event) {
        if(event.getSource() == backButton){
            new DataStructures("Data Structures");
        }
        if(event.getSource() == selectionSortButton){
            new SelectionSort("Data Structures/Sorting/Selection Sort");
        }
        if(event.getSource() == bubbleSortButton){
            new BubbleSort("Data Structures/Sorting/Bubble Sort");
        }
        if(event.getSource() == insertionSortButton){
            new InsertionSort("Data Structures/Sorting/Insertion Sort");
        }
        if(event.getSource() == mergeSortButton){
            new MergeSort("Data Structures/Sorting/Merge Sort");
        }
        if(event.getSource() == quickSortButton){
            new QuickSort("Data Structures/Sorting/Quick Sort");
        }
        if(event.getSource() == radixSortButton){
            new RadixSort("Data Structures/Sorting/Radix Sort");
        }
        dispose();
    }
}
