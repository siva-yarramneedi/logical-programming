import java.io.*;
import java.util.*;

public class Solution {
     
    public static String determine(int year){
        if(year<0){return "invalid";}
        return ((year%4==0 && year%100!=0)||(year%400==0))?"True":"False";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println(determine(year));
        scanner.close();
    }
}