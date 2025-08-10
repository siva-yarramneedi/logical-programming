import java.util.Scanner;
public class LBP035{
    public static int calculateKey(int numMsg){
            int sum = 0;
            int digit = 0;
            while(numMsg!=0){
                digit = numMsg%10;
               if(digit==4||digit==6||digit==8||digit==9){
                sum+=digit;
                }
                numMsg/=10;
            }
            return sum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numMsg = scanner.nextInt();
        System.out.println(calculateKey(numMsg));
    }
}