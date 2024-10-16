/*
L.C: 29. Divide Two Integers

Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

Return the quotient after dividing dividend by divisor.

Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.

Example 1:

Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = 3.33333.. which is truncated to 3.
Example 2:

Input: dividend = 7, divisor = -3
Output: -2
Explanation: 7/-3 = -2.33333.. which is truncated to -2.
 
Constraints:
-231 <= dividend, divisor <= 231 - 1
divisor != 0
*/
public class DivideTwoIntgers {
    public static int divide(int dividend, int divisor) {
        if(dividend == divisor) return 1;
        boolean sign = true;
        if((dividend >= 0 && divisor <0) || (dividend <= 0 && divisor >0)){
            sign = false;
        } 
        int n = Math.abs(dividend);
        int d = Math.abs(divisor);
        int quotient = 0;
        while(n>=d){
            int count = 0;
            while(n >= (d << count+1)){
                count++;
            }
            quotient  += (1 << count);
            n -= (d << count);
        }
        // overFlow condition
        if(dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        return sign?quotient : -quotient ; 
    }
    public static void main(String[] args) {
        // int dividend = 10;
        // int divisor = 3;
        int dividend = -2147483648;
        int divisor = -1;
        System.out.println(divide(dividend, divisor));
    }
}
