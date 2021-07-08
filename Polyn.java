import java.util.*;
class Polyn {
  public static void main(String args[]) {
    Scanner sc =new Scanner (System.in);
    int n,r,sum=0,temp;
    System.out.println("ENTER YOUR NUMBER :");
    n=sc.nextInt();
    temp=n;
    while (n>0) { 
      r=n%10;
      sum=sum*10+r;
      n=n/10;
    }
    if (sum == temp) {
      System.out.println("YOUR NUMBER IS POLYNROM NUMBER      " +sum);
    } else {
      System.out.println("YOUR NUMBER IS NOT POLYNROM NUMBER  " +sum);
    }
    
  }
}
