/*
Next Smaller Element 

Given an array, print the Next Smaller Element (NSE) for every element. The NSE for an element x is the first smaller element on the right side of x in the array. Elements for which no smaller element exist (on the right side), consider NSE as -1. 

Examples: 

Input: [4, 8, 5, 2, 25]
Output: [2, 5, 2, -1, -1]
Explanation:
The first element smaller than 4 having index > 0 is 2.
The first element smaller than 8 having index > 1 is 5.
The first element smaller than 5 having index > 2 is 2.
There are no elements smaller than 4 having index > 3.
There are no elements smaller than 4 having index > 4.

Input: [13, 7, 6, 12]
Output: [7, 6, -1, -1]
Explanation:
The first element smaller than 13 having index > 0 is 7.
The first element smaller than 7 having index > 1 is 6.
There are no elements smaller than 6 having index > 2.
There are no elements smaller than 12 having index > 3.
 */

import java.util.Stack;
public class NextSmallerElement {
    public static int[] nextSmallerElement(int arr[]){
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int ans[] = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){
            int curr = arr[i];
            while(st.peek() >= curr){
                st.pop();
            }
            ans[i] = st.peek();
            st.push(curr);
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[] = {8,4,6,2,3};
        int ans[] = nextSmallerElement(arr);
        System.out.print("Next smaller element of the array is: ");
        for(int i : ans){
            System.out.print(i+" ");
        }

    }
}
