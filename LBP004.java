import java.io.*;
import java.util.*;

public class Solution {

    public static char determine(int n){
        if(n<30 || n>100){ return 'Z';}
        if(n>=30&&n<=50){
            return 'D';
        }
        else if(n>=51&&n<=60){
            return 'C';
        }
        else if(n>=61&&n<=80){
            return 'B';
        }
        else{
            return 'A';
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(determine(n));
        scanner.close();
    }
}