import java.util.Scanner;
public class LBP039{
 
    public static int findNearest(int n1, int n2){
        int count1 = 0; int count2 = 0;
        if(n1>=21&&n2>=21){
            return 0;
        }
        for(int i=n1;i<=21;i++){
            count1++;
        }
        for(int j=n2;j<=21;j++){
            count2++;
        }
        return (count1!=0&&count1)>(count2!=0&&count2)?n2:n1;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println(findNearest(n1,n2));
        scanner.close();
    }
}