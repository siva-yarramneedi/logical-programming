import java.util.Scanner;
public class LBP032{
    
    public static int countSpecialChars(String s){
        char[] arr = s.toCharArray();
        int count = 0;
        for(char c:arr){
            if(!(Character.isLetter(c)||Character.isDigit(c))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(countSpecialChars(s));
        scanner.close();
    }
}