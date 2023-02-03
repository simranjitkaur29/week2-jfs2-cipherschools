package Exception;

import java.util.Scanner;

public class Test0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Hey buddy how old are you ?");

        int age=sc.nextInt();
        System.out.println("You have really grown up!");

        //checked exception are checkedd at compile time,eg:IOexception
        //unchecked exception are checked at runtime eg:InputMismatched Exception
    }
    
}
