import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        System.out.println(sum);
        scanner.close();
    }
}