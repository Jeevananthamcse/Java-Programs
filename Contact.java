import java.util.Scanner;

class Phone {
    private String name;
    private String phonenumber;

    

    Scanner KB = new Scanner(System.in);

 
    void newentry() {
        System.out.print("Enter moblile number: ");
        phonenumber = KB.nextLine();
        System.out.print("Enter Name: ");
        name = KB.nextLine();
       
    }

  
    void show() {
        System.out.println("phone number:"+phonenumber+ "\n name"+ name );
    }
  boolean search(String acn) {
        if (phonenumber.equals(acn)) {
            show();
            return (true);
        }
        return (false);
    }
}

public class Contact {
    public static void main(String arg[]) {
        Scanner KB = new Scanner(System.in);


        System.out.print("How Many contact you want to entry : ");
        int n = KB.nextInt();
        Phone C[] = new Phone[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new Phone();
            C[i].newentry();
        }

        int ch;
        do {
            System.out.println("Main Menu\n1. Display number\n 2. Search By Student details\n 3.Exit ");
                System.out.println("Enter your Choice :"); ch = KB.nextInt();
                switch (ch) {
                    case 1:
                        for (int i = 0; i < C.length; i++) {
                            C[i].show();
                        }
                        break;

                    case 2:
                        System.out.print("Enter phone number you want to search: ");
                        String acn = KB.next();
                        boolean found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed..Account Not Exist..");
                        }
                        break;

                    
                    case 3:
                        System.out.println("thank you !!");
                        break;
                }
            }
            while (ch != 5);
        }
    }
