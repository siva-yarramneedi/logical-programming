import java.io.*;
import java.util.*;

public class Solution {

    public static String checkPalindrome(String text){
        String reverseText = new StringBuilder(text).reverse().toString();
         if(text.equals(reverseText)){
             return "valid";
         }
         else{
             return "invalid";
         }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        System.out.println(checkPalindrome(text));
    }
}