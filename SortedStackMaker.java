import java.util.LinkedList;
import java.util.Stack;

// GENERATE DOCS:
//javadoc *.java -d doc -author -version -use

// RUN PROGRAM:
//javac BubbleSort.java SortedLinkedListMaker.java SortedStackMaker.java
//java SortedStackMaker

/**
 * Class for creating sorted stack from unsorted arrays.
 * 
 * This Class extends the SortedLinkedListMaker class.
 * The sorted Stack is build from the sorted Linked List of the super class.
 * <p>
 * To run this program, first compile it: 
 * `javac BubbleSort.java SortedLinkedListMaker.java SortedStackMaker.java`  
 * then run this class with:
 * `java SortedStackMaker`
 * </p>
 * <p>
 * you will prompted to enter a list of integers into the terminal. Sample input: `2 45 37 21 31 50 29 22 67 88 56`
 * </p>
 * 
 * @author Tanner Huseman
 * @version 1.0.0
 */
public class SortedStackMaker extends SortedLinkedListMaker{
    
    /**
     * The sorted Stack generated from the provided int array
     */
    private Stack<Integer> sortedStack;

    /**
     * Main method leveraged to demonstrate functionality of this class
     * 
     * @param args an array of command-line arguments for the application
     */
    public static void main(String[] args){
        int[] array = getIntArrayFromUser();
        SortedStackMaker sortedStackMaker = new SortedStackMaker(array);
        Stack<Integer> sortedStack = sortedStackMaker.getSortedStack();
        System.out.println(sortedStack);
    }

    /**
     * Constructor method for this class.
     * 
     * Provide the int array that you wish to be made into a sorted stack.
     * 
     * @param array an array of integers to be sorted and converted into a linked list
     */
    public SortedStackMaker(int[] array){
        super(array);
        this.sortedStack = makeStackFromLinkedList(this.getSortedLinkedList());
    }

    /**
     * Linked List to Stack converter.
     * This method is used to take the sorted Linked List from the parent class and convert it
     * into a sorted stack to be used as this class's `sortedStack` attribute.
     * 
     * @param linkedList a linked list to convert into a stack
     * @return stack that was created from the linked list parameter
     */
    public static Stack<Integer> makeStackFromLinkedList(LinkedList<Integer> linkedList){
        Stack<Integer> stack = new Stack<Integer>();
        for(Integer node : linkedList){
            stack.push(node);
        }
        return stack;
    }

    /**
     * This is the getter method for the sortedStack class attribute.
     * 
     * @return the sortedStack class attribute
     */
    public Stack<Integer> getSortedStack(){
        return this.sortedStack;
    }
}