import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        Scanner sc=new Scanner(System.in);
        String word;
        for(int i=0;i<5;i++)
        {
            System.out.println("word : ");
            word=sc.next();
            int count=0;
            map.put(word,word.length());
            
        }
        System.out.println(map);
        for(HashMap.Entry<String, Integer> e : map.entrySet())
        {
            System.out.println(e.getKey()+"---"+e.getValue());

        }
    }

}
