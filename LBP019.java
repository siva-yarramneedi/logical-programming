import java.io.*;
import java.util.*;

public class Solution {

    public static String calculateBinary(int n){
        if(n==0){
            return "0";
        }
        else{
            String binary = "";
            while(n>0){
                binary+=n%2;
                n=n/2;
            }
            return new StringBuilder(binary).reverse().toString();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(calculateBinary(n));
        scanner.close();
    }
}