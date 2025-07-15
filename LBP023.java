import java.io.*;
import java.util.*;

public class Solution {

    public static String findSpecialNumber(int n){
        int digit = 0; int sum = 0; int mul = 1; int originalNumber = n;
        while(n!=0)
        {
            digit = n%10;
            sum+=digit;
            mul*=digit;
            n/=10;
        }
        return originalNumber == sum+mul?"Yes":"No";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(findSpecialNumber(n));
        scanner.close();
    }
}