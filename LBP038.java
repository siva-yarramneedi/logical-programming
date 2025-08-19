import java.util.Scanner;
public class LBP038{
    public static int countSpecialChars(String text){
        char[] arr = text.toCharArray();
        int count = 0;
        for(char c : arr){
            if(c>=65&&c<=90 || c>=97&&c<=122 || c>=48&&c<=57 || c==' '){
                continue;
            }
            else{
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(countSpecialChars(text));
        scanner.close();
    }
}