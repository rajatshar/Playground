import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int fir=n/100;
    int sec=((n/10)%10);
    int last=n%10;
    int rev=(last*100)+(sec*10)+(fir);
    System.out.println(rev);
  }
}