import java.io.*;
import java.util.*;

public class Solution {

    public static int calculateDiscount(int billAmount){
        //logic for extracting the digit
        int digit = 0;
        int sum = 0;
        while(billAmount!=0){
            digit = billAmount%10;
            //logic for prime digit checking
            int count = 0;
            for(int i=2;i<digit;i++){
                if(digit%i==0){
                    count++;
                }
            }
            if(count==0 && digit!=1){
                sum+=digit;
            }
            billAmount/=10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int billAmount = scanner.nextInt();
        System.out.println(calculateDiscount(billAmount));
        scanner.close();
    }
}