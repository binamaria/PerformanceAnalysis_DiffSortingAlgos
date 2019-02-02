import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class NewjFrame extends JFrame{
    private JButton selectionSortButton;
    private JButton bubbleSortButton;
    private JButton insertionSortButton;
    private JButton mergeSortButton;
    private JButton quickSortButton;
    private JButton allAlgorithmButton;
    private JTextArea textArea1;
    private JPanel Panel1;
    private JButton createNewArrayButton;
    private JButton addElementButton1;
    private JTextField textField1;
    private JButton addArraySizeNButton;
    private JTextField textField2;
    private JButton createNewArrayWithButton;

    private List<Integer> inputArray = new ArrayList<Integer>();
    private int arraySize = 0;
    SortingAlgorithms algo10 = new SortingAlgorithms(10);
    SortingAlgorithms algoTenThousand = new SortingAlgorithms(10000);
    int flag =0;
    int counter =0;

    public NewjFrame() {

        selectionSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
long start = System.nanoTime();
if(flag == 1) {
    algo10.SelectionSort();
    long elapsedTime = System.nanoTime() - start;
    textArea1.setText("SELECTION SORT\n Time :" + elapsedTime + " nanosec\n Sorted Array :\n"+algo10.printSelectionSortArray());

}
else if(flag==2){
    algoTenThousand.SelectionSort();
    long elapsedTime = System.nanoTime() - start;
    textArea1.setText("SELECTION SORT\n Time :" + elapsedTime + " nanosec");

}
            }
        });

        bubbleSortButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        long start = System.nanoTime();
                        if(flag==1)
                        {
                            algo10.BubbleSort();
                            long elapsedTime = System.nanoTime() - start;
                            textArea1.setText("BUBBLE SORT\n Time :" + elapsedTime + " nanosec\n Sorted Array :\n"+algo10.printBubbleSortArray());
                        }else if(flag==2)
                        {
                            algoTenThousand.BubbleSort();
                            long elapsedTime = System.nanoTime() - start;
                            textArea1.setText("BUBBLE SORT\n Time :" + elapsedTime + " nanosec");
                        }

                    }
                });

        insertionSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long start = System.nanoTime();
                if(flag==1)
                {
                    algo10.insertionSort();
                    long elapsedTime = System.nanoTime() - start;
                    textArea1.setText("INSERTION SORT\n Time :" + elapsedTime + " nanosec\n Sorted Array :\n"+algo10.printInsertionSortArray());
                }else if(flag==2)
                {
                    algoTenThousand.insertionSort();
                    long elapsedTime = System.nanoTime() - start;
                    textArea1.setText("INSERTION SORT\n Time :" + elapsedTime + " nanosec");
                }

            }
        });

        mergeSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long start = System.nanoTime();
                if(flag==1)
                {
                    algo10.mergeSort(algo10.arr4,0,algo10.arr4.length-1);
                    long elapsedTime = System.nanoTime() - start;
                    textArea1.setText("MERGE SORT\n Time :" + elapsedTime + " nanosec\n Sorted Array :\n"+algo10.printMergeSortArray());
                }else if(flag==2)
                {
                    algoTenThousand.mergeSort(algoTenThousand.arr4,0,algoTenThousand.arr4.length-1);
                    long elapsedTime = System.nanoTime() - start;
                    textArea1.setText("MERGE SORT\n Time :" + elapsedTime + " nanosec");
                }

            }
        });

        quickSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long start = System.nanoTime();
                if(flag==1)
                {
                    algo10.QuickSort(algo10.arr5,0,algo10.arr5.length-1);
                    long elapsedTime = System.nanoTime() - start;
                    textArea1.setText("QUICK SORT\n Time :" + elapsedTime + " nanosec\n Sorted Array :\n"+algo10.printQuickSortArray());
                }else if(flag==2)
                {
                    algoTenThousand.QuickSort(algoTenThousand.arr5,0,algoTenThousand.arr5.length-1);
                    long elapsedTime = System.nanoTime() - start;
                    textArea1.setText("QUICK SORT\n Time :" + elapsedTime + " nanosec");
                }

            }
        });



        addElementButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
if(counter==0){
                inputArray.clear();
counter=1;}
                    inputArray.add(new Integer(textField1.getText()));


                textField1.setText("");
                textArea1.setText("Array getting created..");
            }
        });

        createNewArrayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                flag=1;
                counter=0;
                algo10.inputArray(inputArray);

                textField1.setText("");
                textArea1.setText("New array created :\n"+inputArray);

            }
        });
        addArraySizeNButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                arraySize= new Integer(textField2.getText());

                textField2.setText("");
                textArea1.setText("Array getting created..");
            }
        });


        createNewArrayWithButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

flag=2;
                algoTenThousand.newArrays(arraySize);
                textField2.setText("");
                textArea1.setText("New array of size "+arraySize+" created");
            }
        });







        allAlgorithmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                long start = System.nanoTime();
                if(flag==1)
                {
                    algo10.SelectionSort();
                    long elapsedTime = System.nanoTime() - start;

                    long start1 = System.nanoTime();
                    algo10.BubbleSort();
                    long elapsedTime1 = System.nanoTime() - start1;

                    long start2 = System.nanoTime();
                    algo10.insertionSort();
                    long elapsedTime2 = System.nanoTime() - start2;

                    long start3 = System.nanoTime();
                    algo10.mergeSort(algo10.arr4,0,algo10.arr4.length-1);
                    long elapsedTime3 = System.nanoTime() - start3;

                    long start4 = System.nanoTime();
                    algo10.QuickSort(algo10.arr5,0,algo10.arr5.length-1);
                    long elapsedTime4 = System.nanoTime() - start4;
                    textArea1.setText("SELECTION SORT\n Time :" + elapsedTime + " nanosec"+"\nBUBBLE SORT\n Time :" + elapsedTime1 + " nanosec"+"\nINSERTION SORT\n Time :" + elapsedTime2 + " nanosec"+"\nMERGE SORT\n Time :" + elapsedTime3 + " nanosec"+"\nQUICK SORT\n Time :" + elapsedTime4 + " nanosec");

                }else if(flag==2)
                {
                    algoTenThousand.SelectionSort();
                    long elapsedTime = System.nanoTime() - start;

                    long start1 = System.nanoTime();
                    algoTenThousand.BubbleSort();
                    long elapsedTime1 = System.nanoTime() - start1;

                    long start2 = System.nanoTime();
                    algoTenThousand.insertionSort();
                    long elapsedTime2 = System.nanoTime() - start2;

                    long start3 = System.nanoTime();
                    algoTenThousand.mergeSort(algoTenThousand.arr4,0,algoTenThousand.arr4.length-1);
                    long elapsedTime3 = System.nanoTime() - start3;

                    long start4 = System.nanoTime();
                    algoTenThousand.QuickSort(algoTenThousand.arr5,0,algoTenThousand.arr5.length-1);
                    long elapsedTime4 = System.nanoTime() - start4;
                    textArea1.setText("SELECTION SORT\n Time :" + elapsedTime + " nanosec"+"\nBUBBLE SORT\n Time :" + elapsedTime1 + " nanosec"+"\nINSERTION SORT\n Time :" + elapsedTime2 + " nanosec"+"\nMERGE SORT\n Time :" + elapsedTime3 + " nanosec"+"\nQUICK SORT\n Time :" + elapsedTime4 + " nanosec");

                }

               }
        });
    }

    public static void main(String[] args) {

JFrame obj = new JFrame("NewjFrame");
       obj.setContentPane(new NewjFrame().Panel1);
       obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       obj.pack();

        obj.setVisible(true);
        obj.setResizable(false);
    }



}
