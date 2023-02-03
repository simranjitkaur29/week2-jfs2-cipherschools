package Keywords.keywords;
 class App {
   App()
   {
    System.out.println("Constructor of App");
   } 
   App(int num)
   {
    System.out.println(num);
   }
}
public class SuperKeyword extends App
 {
    SuperKeyword()
    {
     //   super(20);//use to call constructor of base class 
        System.out.println("Constructor of superKeyword");
    }
    public static void main(String[] args) {
        new SuperKeyword();
    }
 }

