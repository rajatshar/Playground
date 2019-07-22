import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner myObj = new Scanner(System.in);
      int no = myObj.nextInt();
      if(no==1)
      {
         System.out.println("One");
      }
      else  if(no==2)
      {
         System.out.println("Two");
      }
       else  if(no==3)
      {
         System.out.println("Three");
      }
       else  if(no==4)
      {
         System.out.println("Four");
      }
       else  if(no==5)
      {
         System.out.println("Five");
      }
      else
      {
         System.out.println("Invalid");
      }
	}
}