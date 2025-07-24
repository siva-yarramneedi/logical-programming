import java.io.*;
import java.util.*;

public class Solution {

    public static boolean checkPrime(int number){
        int count = 0;
        for(int i=2;i<number;i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==0 && number!=1){
            return true;
        }
        else{
            return false;
        }
    }    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(checkPrime(number));
        scanner.close();
    }
}