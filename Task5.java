import java.util.HashMap;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String word;
      
        Scanner sc=new Scanner(System.in);
        HashMap<Character,Integer>map=new HashMap<>();
        System.out.println("Enter a word");
            word=sc.next();
            for(int i=0;i<word.length();i++)
            {
                
                    map.put(word.charAt(i),map.getOrDefault(word.charAt(i), 0)+1);

                

            }
            System.out.println();
    }
}
