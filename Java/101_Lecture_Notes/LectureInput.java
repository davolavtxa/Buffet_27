/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
     System.out.println("Welcome to Har's Khinkalnoc");
     System.out.println("Here is our Menu!:");
     System.out.print("1. Lamb Khinkali:" );
     double itemPrice = 3.50;

     System.out.println(itemPrice);
    System.out.print("2.  Pork Khinkali:" );
     double item2Price = 3.50;
     System.out.println(item2Price);
     
     System.out.print("3. Fried Lamb Khinkali:" );
     double item3Price = 4.50;
     System.out.println(item3Price);

     System.out.println("How many Khinkalis would you like?");
     Scanner sc = new Scanner (System.in);

     int item1Quant = sc.nextInt();
     System.out.println("Item 1 Total is:" );
     
	}
}
