import java.io.File;
public class Test1 {
    //checking if file exists and fetching file details !!
    public static void main(String[] args) {
        File f=new File("C:\\CipherSchoolAssignments\\week2-Assignments\\FindHandling\\testFile.txt");

        //exists()->to check if file exists or not

        if(f.exists())
        {
            System.out.println("Printing file details");
            System.out.println("--------------");

            System.out.println("File Name : "+f.getName());
            System.out.println("Fule Size : "+f.length());
            System.out.println("File Path : "+f.getAbsolutePath());
            System.out.println("Is file readable ? "+f.canRead() );
            System.out.println("Is file writable : "+f.canWrite());

            System.out.println("--------------");

        }
        File fl=new File("C:/CipherSchoolAssignments/week2-Assignments/FindHandling/avengers");

        fl.mkdir();
    }
    
}
