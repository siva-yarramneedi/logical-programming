import java.io.*;
import java.util.*;

public class Solution {
    
    public static int calculate(int n){
        int digit = 0;
        int sum = 0;
        while(n!=0){
            digit = n%10;
            if(digit%2!=0){
                sum+=digit;
            }
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(calculate(n));
        scanner.close();
    }
}