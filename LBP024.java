import java.io.*;
import java.util.*;

public class Solution {
    
    public static int sum(int x, int y){
        int sum = 0;
        for( ; x<=y; x++){
            if(x%2==0){
                sum+=x;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(sum(x,y));
        scanner.close();
    }
}