import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> map=new HashMap<>();
        int num;
        String result;
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter your marks: ");
            num=sc.nextInt();
            if(num>45)
            {
                result="Pass";

            }
            else{
            result="Fail";}
            map.put(num,result);

        }
        for(HashMap.Entry<Integer,String> e:map.entrySet())
        {
            System.out.println("Marks : "+e.getKey()+" Result : "+e.getValue());
        }
    }
}
