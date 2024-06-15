import java.util.LinkedList;
import java.util.Scanner;



// GENERATE DOCS:
//javadoc *.java -d doc -author -version -use

// RUN PROGRAM:
//javac BubbleSort.java SortedLinkedListMaker.java
//java SortedLinkedListMaker

/**
 * Class for creating sorted linked lists from unsorted arrays.
 * 
 * <p>
 * To run this program, first compile it: 
 * `javac BubbleSort.java SortedLinkedListMaker.java`  
 * then run this class with:
 * `java SortedLinkedListMaker`
 * </p>
 * <p>
 * you will prompted to enter a list of integers into the terminal. Sample input: `2 45 37 21 31 50 29 22 67 88 56`
 * </p>
 * 
 * @author Tanner Huseman
 * @version 1.0.0
 */
public class SortedLinkedListMaker {
    
    /**
     * The sorted LinkedList generated from the provided int array
     */
    private LinkedList<Integer> sortedLinkedList;

    /**
     * Main method leveraged to demonstrate functionality of this class
     * 
     * @param args an array of command-line arguments for the application
     */
    public static void main(String[] args){
        int[] array = getIntArrayFromUser();
        SortedLinkedListMaker sortedLinkedListMaker = new SortedLinkedListMaker(array);
        LinkedList<Integer> sortedLinkedList = sortedLinkedListMaker.getSortedLinkedList();
        System.out.println(sortedLinkedList);
    }

    /**
     * Constructor method for this class.
     * 
     * Provide the int array that you wish to be made into a sorted linked list.
     * 
     * @param array an array of integers to be sorted and converted into a linked list
     */
    public SortedLinkedListMaker(int[] array){
        this.sortedLinkedList = makeSortedLinkedList(array);
    }

    /**
     * getter method for the sortedLinkedList class attribute
     * 
     * @return the sortedLinkedList class attribute; A LinkedList containing the sorted elements of the array used to initialize the class.
     */
    public LinkedList<Integer> getSortedLinkedList(){
        return this.sortedLinkedList;
    }

    /**
     * private method used in the constructor to sort the provided int array and convert it to a linked list
     * 
     * @param array an array of integers
     * @return a LinkedList containing the elements of the array sorted.
     */
    private static LinkedList<Integer> makeSortedLinkedList(int[] array){
        BubbleSort.bubbleSort(array);
        LinkedList<Integer> sortedLinkedList = convertArrayToLinkedList(array);
        return sortedLinkedList;
    }

    /**
     * method for getting an int array from user input
     * 
     * Users are prompted to enter a list of integers in the terminal that are separated by a space.
     * 
     * @return an int[] from the users input.
     */
    public static int[] getIntArrayFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a space delineated list of integers. (example: 2 45 37 21 31 50 29 22 67 88 56): ");
        String numString = scanner.nextLine();
        scanner.close();
        String[] splitNumsString = numString.split(" ");
        int[] intArray = convertArrayStringsToArrayInts(splitNumsString);
        return intArray;
    }

    /**
     * method which converts an Array of Strings to an Int Array.
     * 
     * each value in the String[] should be a string of a integer, ie ["10", "33"]
     * 
     * @return an int[] from String[] provided.
     */
    public static int[] convertArrayStringsToArrayInts(String[] strArray){
        int[] array = new int[strArray.length];
        for(int i = 0; i < strArray.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
        }
        return array;
    }
    
    /**
     * method which converts an Array of Integers into a LinkedList.
     * 
     * @return an LinkedList from the int[] provided.
     */
    public static LinkedList<Integer> convertArrayToLinkedList(int[] array){
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for(int value : array){
            linkedList.add(value);
        }
        return linkedList;
    }

}
