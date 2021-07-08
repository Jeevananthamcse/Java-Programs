import java.util.*;
class Amstrong {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n,r,sum=0,o;
    System.out.println("ENTER YOUR NUMBER :");
    n=sc.nextInt();
    o=n;
    while(n>0)  
    {  
      r=n%10;  
      n=n/10;  
      sum=sum+(r*r*r);  
    } 
    
    if (o == sum) {
      System.out.println("AMSTRONG NUMBER :"+sum);
    } 
    
    else {
      System.out.println("NOT AMSTRONG NUMBER :"+sum);
    }
  }
} 
