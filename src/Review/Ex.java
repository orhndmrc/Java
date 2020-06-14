package Review;

import java.util.Arrays;
import java.util.Stack;

public class Ex {
    public static void main(String[] args) {

            Stack<Integer> myStack = new Stack<Integer>();
            int[] arr ={12,23,1,45,9};

            for (int i = 0; i < arr.length; i++) {
                myStack.push(arr[i]);
            }
            int[] reversedarr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                reversedarr[i] = myStack.pop();
            }
            System.out.println("Original array "+Arrays.toString(arr));
            System.out.println("Reversed array is " + Arrays.toString(reversedarr));
        }
    }
