import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
    
    public static void main(String[] args) throws IOException{
        
        //writing data in file.

        FileWriter fw=new FileWriter("C:/CipherSchoolAssignments/week2-Assignments/FileHandling/testFile.txt",true);

        //.write method to write data in file

        fw.write("I am the Earth\n");
        fw.write("I am the forest green\n");
        fw.write("I am the winds blowing\n");
        fw.write("I am Earth\n");
        fw.write("hello\n");
        fw.write("good evening\n");

        fw.flush();//flush clears the data in the buffer memory and writes into the file

        fw.close();//closing the connection file

        System.out.println("file prepared succesfully");

    }
}
