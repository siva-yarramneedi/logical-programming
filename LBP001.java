import java.util.Scanner;
public class LBP001{
    public static String isEvenOrOdd(int value){
            if(value<0){
                return "invalid";
            }
            return value%2==0?"even":"odd";
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println(isEvenOrOdd(value));
        scanner.close();
    }
}