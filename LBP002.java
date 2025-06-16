import java.io.*;
import java.util.*;

public class Solution {

    public static String determine(int n){
        if(n<1||n>100){
            return "invalid";
        }
        if((n%2==0) && ((n>=2&&n<=5)||(n>20))){
            return "Not Weird";
        }
        else{
            return "Weird";
        }       
    }    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(determine(n));
        scanner.close();
    }
}