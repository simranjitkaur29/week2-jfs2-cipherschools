class GrandFather
{
    public String surname="gill";
    public int lands=10;
   public String getSurname() {
       return surname;
   }


}
class Father extends GrandFather
{
    public String goverJob="Professor";
    public String getGoverJob() {
        return goverJob;
    }

}
class Child extends Father
{
    public int cars=2;
    public int getCars() {
        return cars;
    }

}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Child ram=new Child();
        System.out.println(ram.getCars());
       System.out.println( ram.getGoverJob());
        System.out.println(ram.getSurname());

    }
   
    
}
