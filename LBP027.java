import java.io.*;
import java.util.*;

public class Solution {

    public static int calculateSum(int i, int j, int k){
        int sum = 0;
        while(i<=j){
            sum+=i;
            i++;
        }
        while(j>k){
            j--;
            sum+=j;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(calculateSum(i,j,k));
    }
}