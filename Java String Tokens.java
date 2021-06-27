import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();        
        s = s.trim();
        if (s.length() != 0){
            String [] str = s.split("[ !,?._'@]+");
            System.out.println(str.length);
            for (String q:str){
                System.out.println(q);
            }
        }
        else{
            System.out.println("0");
        }
    }
}

