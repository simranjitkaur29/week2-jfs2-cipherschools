import java.io.BufferedReader;
import java.io.FileReader;
//reading the file;

public class Test4 {
    public static void main(String[] args) throws Exception {

        FileReader fr=new FileReader("C:\\CipherSchoolAssignments\\week2-Assignments\\FileHandling\\testFile.txt");

        BufferedReader br=new BufferedReader(fr);

        String line;
        while((line=br.readLine())!=null)
        {
        System.out.println(line);
        }
    }
    
}
