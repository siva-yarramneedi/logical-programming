import java.util.Scanner;
public class LBP044{

    public static int sum(int a, int b){
        return a==b?2*(a+b):a+b;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(sum(a,b));
        scanner.close();
    }
}