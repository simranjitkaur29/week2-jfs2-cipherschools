package Keywords.keywords;
class Test1
{
    int arg=5;
    Test1()
    {
        System.out.println("Hi !i am default constructor");
    }
    Test1(int arg)
    {
        this();//use for call the default constructor also.
        this.arg=arg;
    }
}
public class ThisKeyword{
    public static void main(String[] args) {
        Test1 obj=new Test1(10);
        System.out.println(obj.arg);
    }

}