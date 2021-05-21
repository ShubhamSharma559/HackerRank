import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.US);
        String s1 = nf1.format(payment);
        System.out.println("US: "+s1);
        
        NumberFormat nf2 = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String s2 = nf2.format(payment);
        System.out.println("India: "+s2);
        
        NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String s3 = nf3.format(payment);
        System.out.println("China: "+s3);
        
        NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String s4 = nf4.format(payment);
        System.out.println("France: "+s4);
        
        
    }
}
