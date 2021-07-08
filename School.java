import java.util.Scanner;

class Student {
    private String name;
    private String regno;
    private long m1;
    private long m2;
    private long m3;
    private long t;
    private long per;
    

    Scanner KB = new Scanner(System.in);

    //method to open an account
    void newentry() {
        System.out.print("Enter regno: ");
        regno = KB.nextLine();
        System.out.print("Enter Name: ");
        name = KB.nextLine();
        System.out.print("Enter mark1: ");
        m1 = KB.nextLong();
        System.out.print("Enter mark2: ");
        m2 = KB.nextLong();
        System.out.print("Enter mark3: ");
        m3 = KB.nextLong();
    }

    //method to display account details
    void show() {
        System.out.println("regno:"+regno + "\n name"+ name + "\n marks :" + m1+","+m2+","+m3);
    }

    //method to deposit money
    void total() {
    t=m1+m2+m3;
    per=t/3;
    System.out.println("total :"+t);
    System.out.println("persentage:"+per);
    
        
    }

    //method to withdraw money
    void pass() {
        if (m1 >=35 && m2>=35 && m3>=35) {
           System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }

    //method to search an account number
    boolean search(String acn) {
        if (regno.equals(acn)) {
            show();
            return (true);
        }
        return (false);
    }
}

public class School {
    public static void main(String arg[]) {
        Scanner KB = new Scanner(System.in);

        //create initial accounts
        System.out.print("How Many student you want to entry : ");
        int n = KB.nextInt();
        Student C[] = new Student[n];
        for (int i = 0; i < C.length; i++) {
            C[i] = new Student();
            C[i].newentry();
        }

        //run loop until menu 5 is not pressed
        int ch;
        do {
            System.out.println("Main Menu\n1. Display Student\n 2. Search By Student details\n 3. total\n 4. pass\n 5.Exit ");
                System.out.println("Enter your Choice :"); ch = KB.nextInt();
                switch (ch) {
                    case 1:
                        for (int i = 0; i < C.length; i++) {
                            C[i].show();
                        }
                        break;

                    case 2:
                        System.out.print("Enter regno No U Want to Search...: ");
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
                        System.out.print("Enter regno No : ");
                        acn = KB.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                C[i].total();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed..Account Not Exist..");
                        }
                        break;

                    case 4:
                        System.out.print("Enter regno No : ");
                        acn = KB.next();
                        found = false;
                        for (int i = 0; i < C.length; i++) {
                            found = C[i].search(acn);
                            if (found) {
                                C[i].pass();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed..Account Not Exist..");
                        }
                        break;

                    case 5:
                        System.out.println("thank you !!");
                        break;
                }
            }
            while (ch != 5);
        }
    }
