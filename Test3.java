package Exception;
import java.io.File;

public class Test3 {
    public static void main(String[] args)throws Exception {
        File f=new File("c://abc.txt");
        f.createNewFile();
        //throws is an indication there is a need of exception handling here try/catch 
        
    }
}
