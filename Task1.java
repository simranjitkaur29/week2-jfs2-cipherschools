import java.util.*;

import javax.swing.text.StyledEditorKit.BoldAction;
import javax.swing.text.html.Option;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean condition;
        ArrayList<Product>cart=new ArrayList<Product>();
        do
        {
        System.out.println("Product title : ");
        String title=sc.next();
        System.out.println("Price : " );
        int price=sc.nextInt();        
        cart.add(new Product(title,price));
        System.out.println("Do you want to add more items? : ");
        condition=sc.nextBoolean();       
    }
    while(condition);
    for(Product p:cart)
    {
        System.out.println("Title: "+p.getTitle()+" Price : "+p.getPrice());
    }
    int totalPrice=0;
    for(Product p:cart)
    {
       totalPrice+=p.getPrice(); 
    }
    System.out.println( "Total bill : "+totalPrice);
} 
}
class Product
{
    String title;
    int price;
    public Product(String title,int price)
    {
        this.title=title;
        this.price=price;
    }
    public String getTitle()
    {
        return title;
    }
    public int getPrice()
    {
        return price;
    }
       
}

