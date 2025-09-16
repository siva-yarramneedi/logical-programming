import java.util.Scanner;
public class LBP043{

    public static int calculateDiscount(int billAmount){
        int digit = 0;  int evenSum = 0;  int oddSum = 0;
        while(billAmount!=0){
            digit = billAmount%10;
            if(digit%2==0){
                evenSum+=digit;
            }
            else{
                oddSum+=digit;
            }
            billAmount/=10;
        }
        return evenSum*oddSum;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int billAmount = scanner.nextInt();
        System.out.println(calculateDiscount(billAmount));
        scanner.close();
    }
    
}