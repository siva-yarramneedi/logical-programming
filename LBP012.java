import java.io.*;
import java.util.*;

public class Solution {
    
    public static int calculateSum(int n){
        int digit = 0;
        int sum = 0;
        while(n!=0){
            digit = n%10;
            if(digit==3||digit==6||digit==9){
                sum+=digit;
            }
            n=n/10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(calculateSum(number));
        scanner.close();
    }
}