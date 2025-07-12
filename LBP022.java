import java.io.*;
import java.util.*;

public class Solution {

    public static String findNivenNumber(int number){
        int actualNumber = number;
        int sum = 0;
        while(number!=0){
            sum+=number%10;
            number/=10;
        }
        return actualNumber%sum==0?"Yes":"No";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(findNivenNumber(number));
        scanner.close();
    }
}