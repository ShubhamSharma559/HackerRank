import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int s = A.length();
        char [] arr = new char[s];
        char [] arr1 = new char[s];
        
        for (int i = 0;i<s;i++){
            arr[i] = A.charAt(i);        
        }
        
        for (int i = 0;i<s;i++){
            arr1[s-i-1] = arr[i];
        }
        
        if(Arrays.equals(arr,arr1)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}



