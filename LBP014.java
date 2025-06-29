import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        if(n==0){
            System.out.println(0);
        }
        else{
        while(n!=0){
            System.out.print(n%10);
            n/=10;
            }
        }
    }
}