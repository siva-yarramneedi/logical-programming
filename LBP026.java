import java.io.*;
import java.util.*;

public class Solution {
    
    public static int toCelsius(int fahrenheit){
        return (fahrenheit-32)*5/9;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fahrenheit = scanner.nextInt();
        System.out.println(toCelsius(fahrenheit));
        scanner.close();
    }
}