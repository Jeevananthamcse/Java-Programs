import java.util.Scanner;
class B{
  private int a,b,t;
  private float per;
  private String name;
    
  public void get()
  { 
    
  Scanner sc=new Scanner(System.in);
    
    System.out.println("enter your a  :");
    a=sc.nextInt();
    System.out.println("enter your b:");
    b=sc.nextInt();

   }
  
  
  public void print()
  {                            
    System.out.println("a:"+a);
    System.out.println("b :"+b);
     t=a+b;
      System.out.println("t :"+t);
    
    
   }

  }
class Aii{

  public static void main(String arg[]) {

    B e=new B();
    e.get();
    e.print();
    
  
    
    
    
  }
 }
