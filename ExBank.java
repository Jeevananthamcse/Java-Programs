import java.util.Scanner;

class School {
    private String regno;
    private String name;
    private long  m1;
    private long m2;
    private long m3;
  

    Scanner KB = new Scanner(System.in);

    //method to open an account
    void student() {
        System.out.print("ENTER YOUR REGISTER NUMBER: ");
        regno = KB.next();
        System.out.print("ENTER YOUR NAME: ");
        name = KB.next();
        System.out.print("Enter MARK 1 : ");
        m1 = KB.nextLong();
        System.out.print("Enter MARK 2 : ");
        m2 = KB.nextLong();
        System.out.print("Enter MARK 3 : ");
        m3 = KB.nextLong();
    }

    //method to display account details
    void showStudent() {
        System.out.println(regno + "\n" + name + "\n mark 1:" +m1+"\n mark 2:"+m2+"\n mark 3:"+m3 );
    }


    void deposit() {
        long amt;
        System.out.println("Enter A: ");
        amt = KB.nextLong();
        if (m1>=35 && m2>=35 && m3>=35){
           System.out.println("pass");
           }
        else {
             System.out.println("fail");  
        }
    }

    //method to search an account number
    boolean search(String acn) {
        if (regno.equals(acn)) {
            showStudent();
            return (true);
        }
        return (false);
    }
}

public class ExBank {
    public static void main(String arg[]) {
        Scanner KB = new Scanner(System.in);

        //create initial accounts
        System.out.print("How Many Customer U Want to Input : ");
        int n = KB.nextInt();
        School C[] = new School[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new School();
            C[i].openAccount();
        }

        //run loop until menu 5 is not pressed
        int ch;
        do {
            System.out.println("Main Menu\n1. display student\n 2. Search student\n 3. rank\n 4.Exit ");
                System.out.println("Ur Choice :"); ch = KB.nextInt();
                switch (ch) {
                    case 1:
                        for (int i = 0; i < C.length; i++) {
                            C[i].showStudent();
                        }
                        break;

                    case 2:
                        System.out.print("Enter register No U Want to Search...: ");
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



                        if (!found) {
                            System.out.println("Search Failed..Account Not Exist..");
                        }
                        break;

                    case 3:
                        System.out.println("Good Bye..");
                        break;
                }
            }
            while (ch != 5);
        }
    }
