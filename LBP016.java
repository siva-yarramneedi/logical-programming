import java.io.*;
import java.util.*;

public class Solution {
    
    public static int findOccurences(int n, int d){
        int count = 0;
        while(n!=0){
            if(d==n%10){
                count++;
            }
            n/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(findOccurences(n,d));
        scanner.close();    
    }
}