import java.io.*;
import java.util.*;

public class Solution {

    public static boolean duckOrNot(){
        return String.valueOf(new Scanner(System.in).nextInt()).contains("0");
    }
    public static void main(String[] args) {
        boolean b = duckOrNot();
        System.out.println(b?"Yes":"No");
    }
}