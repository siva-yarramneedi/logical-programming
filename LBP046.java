import java.util.Scanner;
public class LBP046{

    public static boolean isMagic(String date){
        String[] arr = date.split("-");
        int result = Integer.valueOf(arr[0])*Integer.valueOf(arr[1]);
        return arr[2].endsWith(String.valueOf(result));
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        System.out.println(isMagic(date));
        scanner.close();
    }
}