import java.util.Scanner;
public class LBP040{
    public static int reverse(int n){
        int reverse = 0;
        while(n!=0){
            reverse = reverse*10+n%10;
            n/=10;
        }
        return reverse;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println(reverse(value));
        scanner.close();
    }
}