import java.io.File;
public class Test0 {
    //create new file
    public static void main(String[] args) {
       File f=new File("C:\\CipherSchoolAssignments\\week2-Assignments\\FindHandling\\testFile.txt");

       try
       {
        f.createNewFile();
       }
       catch(Exception e)
       {
        e.printStackTrace();
       }
       System.out.println("File created successfully ");
    }
}
