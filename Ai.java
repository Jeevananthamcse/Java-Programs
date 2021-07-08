import java.util.*;
import java.util.Scanner;
class B{
  private int regno,m1,m2,m3,total,n;
  private float per;
  private String name;
    
  public void get()
  { 
    
  Scanner sc=new Scanner(System.in);
    
    System.out.println("enter your name  :");
    name=sc.nextLine();
    System.out.println("enter reg number:");
    regno=sc.nextInt();
    System.out.println("enter mark one :");
    m1=sc.nextInt();
    System.out.println("enter mark two  :");
    m2=sc.nextInt();
    System.out.println("enter mark three  :");
     m3=sc.nextInt();
    
  
   }
  
  
  public void print()
  {                            
    System.out.println("name :"+name);
    System.out.println("reg number :"+regno);
    System.out.println("mark 1 :"+m1);
    System.out.println("mark 2 :"+m2);
    System.out.println("mark 3 :"+m3);
   }
    
  public void total()
  {  
    total=m1+m2+m3;
    per=total/3;
    System.out.println("total :"+total);
    System.out.println("persentage :"+per);
   } 
  
  public void pass()
  {   
    if (m1>=35 && m2>=35 && m3>=35) {
      System.out.println("PASS !!!! :)");
      
    }
    else {
      System.out.println("fail !!!! :(");
    } 
   }
  
  }
class Ai{
  private int n; 
  public static void main(String arg[]) {

    B e=new B();
    e.get();
    e.print();
    e.total();
    e.pass();
  
    
    
    
  }
 }
