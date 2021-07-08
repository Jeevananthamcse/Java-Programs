import java.util.*;
class A {
 int arr[]=new int[5];
  void getdata(){
    Scanner s=new Scanner(System.in);
    for(int i=0;i<5;i++)
    {
    
    System.out.println("enter the value"+(i+1));
     arr[i]=s.nextInt();
    }
    }
  void display()
  {
    for(int i=0;i<5;i++)
    {
   System.out.println(arr[i]);
    }
    }
   }                                
class Bw{
  public static void main(String args[]) {
    A o = new A();
    o.getdata();
    o.display();
  }
 }    
