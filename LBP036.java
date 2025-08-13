import java.util.Scanner;
public class LBP036{

    public static char findUpperCaseChar(String s){
        char[] arr = s.toCharArray();
        for(char c:arr){
            //if(Character.isUpperCase(c)){
            if(c>=65&&c<=90){
                return c;
            }
        }
        return ' ';
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(findUpperCaseChar(s));
        scanner.close();
    }
}