import java.io.*;
import java.util.*;

public class Solution {

    public static int calculateSum(int n){
        //extract the digit
        int digit = 0;
        int sum = 0;
        while(n!=0){
            digit = n%10;
         //logic for prime
            int count = 0;
            for(int i=2;i<=digit-1;i++){
                if(digit%i==0){
                    count++;
                }
            }
            if(count==0 && digit!=1){
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