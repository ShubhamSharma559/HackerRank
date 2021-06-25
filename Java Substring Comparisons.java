import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        int a = s.length()-k;
        
        String [] arr = new String[a+1];
        
        for (int i = 0;i<a+1;i++){
            arr[i] = s.substring(i,i+k);    
        }
        
        for (int i = 0;i<=a;i++){
            for (int j = 0;j<=a;j++){
            
                int b = 0;
                b = arr[i].compareTo(arr[j]);
                if(b<0)
                  {
                      String str = arr[i];
                      arr[i] = arr[j];
                    arr[j] = str;
                    }
        
            }
        }
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest = (arr[0]);
        largest = (arr[s.length()-k]);
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
