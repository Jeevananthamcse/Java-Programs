import java.util.*;
class Cal {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
    int a,b,c,d;
    System.out.println("ENTER THE VALUE ONE :");
    a=sc.nextInt();
    System.out.println("ENTER THE VALUE TWO :");
    b=sc.nextInt();
    System.out.println("1 for ADD  \n 2 for SUB \n 3 for MULL \n 4 for DIV \n ENTER YOUR OPTION :  ");
    d=sc.nextInt();
    
    switch (d) {
      case 1 : 
        c=a+b;
        System.out.println("THE ADDED VALUE IS :"+c);
        break;
      case 2 : 
        c=a-b;
        System.out.println("THE SUBRACTED VALUE IS :"+c);
        break;
      case 3 :
        c=a*b;
        System.out.println("THE MULTIPLED VALUE IS :"+c);
        break;
      case 4 :
        c=a/b;
        System.out.println("THE DIVIED VALUE IS :"+c);
        break;
      default: 
        System.out.println("YOUR VALUE IS IN VALIED :-(");
        break;
    }
  }
}
