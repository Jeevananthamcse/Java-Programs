import java.io.*;
import java.util.Scanner;
class CheckFileOrDir1
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the path for file or directory");
String path=s.next();
File file=new File(path);
boolean isFile=file.isFile();
if(isFile)
System.out.println(file.getPath()+"is a file");
else
System.out.println(file.getPath()+"is not a file");
boolean isDirectory=file.isDirectory();
if(isDirectory)
System.out.println(file.getPath()+"is a directory");
else
System.out.println(file.getPath()+"is not a directory");
}
}
