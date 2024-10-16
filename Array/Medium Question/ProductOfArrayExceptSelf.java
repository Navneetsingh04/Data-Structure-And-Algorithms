/*
L.C:  238. Product of Array Except Self

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 
Constraints:
2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
*/
import java.util.Arrays;
public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int arr[]){
        int n = arr.length;
        int ans[] = new int[n];
        int leftProduct = 1;
        for(int i = 0;i<n;i++){
            ans[i] = leftProduct;
            leftProduct *= arr[i];
        }
        int rightProduct = 1;
        for(int i = n-1;i>=0;i--){
            ans[i] *= rightProduct;
            rightProduct *= arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
}
