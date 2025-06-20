import java.io.*;
import java.util.*;

public class Solution {
 
    public static int calculate(int cupsBought){
        return cupsBought+(cupsBought/6);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cupsBought = scanner.nextInt();
        System.out.println(calculate(cupsBought));
        scanner.close();
    }
}