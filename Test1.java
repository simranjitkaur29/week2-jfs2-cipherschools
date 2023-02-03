package Exception;


import java.util.Scanner;

//1.1 try-contains code that we think has probability to generate/throw error at runTimeException
//1.2 catch-excute only if any error occurs in try block ,if there is no exception it will not execute.
//1.3 throw=it is used to raise exceptions manually!
//1.4 throws=temporary fix exception andd need to add try catch block
//1.5 finally-finally block excutes irrespective of if any exception is occur in try block or not.
public class Test1 {
    int n1,n2,result;
    Scanner sc=new Scanner(System.in);

    void calculate(){
    try {
    
        System.out.println("Enter first number ");
        n1=sc.nextInt();

        System.out.println("Enter your second number ");
        n2=sc.nextInt();
        if(n2==0)
        {//testing prespective
            throw new ArithmeticException();
        }

        result=n1/n2;
      
    }
// e(object)-is when exception occurs then details will stored in e

    catch(ArithmeticException ae)
    {
        System.out.println("Arithmetic Exception is occured");
    }

    catch(Exception e){
        System.out.println("Ouch! Exception Detected!");

    }
    finally{
        System.out.println("The Division is "+result);
    }

}
    public static void main(String[] args) {
        Test1 obj=new Test1();
        obj.calculate();

    }

    
}
