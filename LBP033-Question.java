import java.util.Scanner;
public class LBP033{
    public static int calculatePercentage(int billAmount){
        int digit = 0;
        int sum = 0;
        while(billAmount!=0){
            digit = billAmount%10;
            if(digit%2!=0){
                sum+=digit;
            }
            billAmount/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int billAmount = scanner.nextInt();
        System.out.println(calculatePercentage(billAmount));
        scanner.close();
    }
}