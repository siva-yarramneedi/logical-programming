import java.util.Scanner;
public class LBP041{
    public static int generateOtp(int orderId){
        int product = 1;
        while(orderId!=0){
            product*=orderId%10;
            orderId/=10;
        }
        return product;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int orderId = scanner.nextInt();
        System.out.println(generateOtp(orderId));
        scanner.close();
    }
}