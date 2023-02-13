import java.util.HashMap;

public class Task4 {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        
        String identity;
        for(int i=0;i<=3;i++)
        {
            if(i%2==0)
            {
                identity="Even";
            }
            else{
                identity="Odd";
            }
            map.put(i,identity);
        }
        for(HashMap.Entry<Integer,String> e:map.entrySet())
        {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
