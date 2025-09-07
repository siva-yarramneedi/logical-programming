import java.util.Scanner;
public class LBP042{

    public static int primeSum(int a, int b){
        int sum = 0;
        for(int i=a;i<=b;i++){
            //logic for prime check
            int count = 0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0&&i!=1){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(primeSum(a,b));
        scanner.close();
    }
}