import java.util.Scanner;
public class LBP037{
    public static String toggleCase(String s){
        String toggle = "";
        char[] arr = s.toCharArray();
        for(char c:arr){
            if(Character.isUpperCase(c)){
                toggle+=Character.toLowerCase(c);
            }
            else{
                toggle+=Character.toUpperCase(c);
            }
        }
        return toggle;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(toggleCase(s));
        scanner.close();
    }
}