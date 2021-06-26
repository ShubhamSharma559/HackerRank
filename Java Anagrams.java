import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        
        String A = a.toLowerCase();
        String B = b.toLowerCase();

        int x = a.length();
        int y = b.length();
        
        char[] ch1 = new char[x];
        char[] ch2 = new char[y];
        
        int u = 0;
        boolean m = false;
        
        ch1 = A.toCharArray();
        ch2 = B.toCharArray();
        if (x != y){
            u = 0;
        }
        
        if(x == y){
            for (int i = 0;i<x;i++){
                int d = 0;                
                for (int j = 0;j<x;j++){
                    if(ch1[i] == ch2[j] && d == 0){
                       ch2[j] = ch1[i] = 0;
                       d++;  
                    } 
                }
            }
            
            for (int i = 0;i<x;i++){
                if(ch2[i] == 0 && ch1[i] == 0){
                    u++;
                }
            } 
        }
        
        if(u == x){
            m = true;
        }
        else{
            m = false;
        }
        
        return m;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
