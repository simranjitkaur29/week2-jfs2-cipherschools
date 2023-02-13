import java.io.File;
public class File3 {
    public static void main(String[] args) {
        //listing file
        File f=new File("C:\\JAVA");
        String[] files=f.list();
        for(String file:files)
        {
            System.out.println(file);
        }
    }
}
