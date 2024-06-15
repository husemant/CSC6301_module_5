//javadoc BubbleSort.java -d doc -author -version -use

/**
 * Class for sorting integer arrays.
 * <p>
 * This class leverages an implimentation of bubble sort to sort arrays of integers.
 * </p>
 * <p>
 * This class also is able to display a given array to the terminal.
 * </p>
 * 
 * @author Tanner Huseman
 * @version 1.0.0
 */
public class BubbleSort {
    
    /**
     * Constructor method for this helper class.
     * 
     * Because this BubbleSort class doesn't have any attributes, the constructor has no parameters.
     */
    public BubbleSort(){
    }

    /**
     * Main method leveraged to demonstrate functionality of the bubbleSort() and displayArray() methods
     * 
     * @param args an array of command-line arguments for the application
     */
    public static void main(String[] args) {
        int[] array = {2, 45, 37, 21, 31, 50, 29, 22, 67, 88, 56};
        System.out.println("Array before sorting:");
        BubbleSort.displayArray(array);
        BubbleSort.bubbleSort(array);
        System.out.println("Array after sorting:");
        BubbleSort.displayArray(array);
    }

    /**
     * Display an array in the terminal
     * 
     * @param array an array of integers to be displayed in terminal
     */
    public static void displayArray(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    /**
     * Sort an array of integers
     * 
     * This method will sort an array using the bubble sort algorithm.
     * 
     * @param array an array of integers to be sorted
     */
    public static void bubbleSort(int[] array) {
        int size = array.length;
        boolean itterateAgain = true;
        while (itterateAgain) {
            itterateAgain = false;
            for (int i = 0; i < size-1; i++){
                int current = array[i];
                int next = array[i+1];
                if (current > next) {
                    array[i] = next;
                    array[i+1] = current;
                    itterateAgain = true;
                }
            }
        }
    }
}

