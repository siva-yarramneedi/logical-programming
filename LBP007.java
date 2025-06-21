import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n!=0){
            System.out.print(n%10+" ");
            n = n/10;
        }
        scanner.close();
    }
}