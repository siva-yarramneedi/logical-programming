import java.util.Scanner;
public class LBP034{
//Not Completed
    public static boolean validateMail(String mail){
        // && mail.contains([0-9]) && mail.endsWith("gmail.com")
        if(mail.startsWith("[a-z]")){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String mail = scanner.next();
        System.out.println(validateMail(mail));
        scanner.close();
    }
}