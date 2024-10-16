/*
*********
 *******
  *****
   ***
    *
*/

import java.util.Scanner;
public class InvertedFullPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = s.nextInt();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<i;j++){
                System.out.print(" ");
            }
            for(int j = i;j<2*n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
        }
    }