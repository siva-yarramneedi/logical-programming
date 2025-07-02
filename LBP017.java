import java.io.*;
import java.util.*;

public class Solution {

    public static String checkPalindrome(int n){
        int actual = n;
        int reverse = 0;
        while(n!=0){
            reverse = reverse*10+(n%10);
            n/=10;
        }
        if(actual==reverse){
            return "Yes";
        }
        else{
            return "No";
        }
    }    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(checkPalindrome(n));
        scanner.close();
    }
}