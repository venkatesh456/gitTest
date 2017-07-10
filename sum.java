import java.io.*;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Main
{
public static void main(String args[]) throws FileNotFoundException
{
File f= new File(args[0]);
Scanner ip = new Scanner(f);
String line;
while(ip.hasNextLine())
{
line = ip.nextLine();
int a = Integer.parseInt(line);
int d=0,m;
while(a>0)
{
m= a%10;
d= d+m;
a= a/10;	
}
System.out.println(d);
}
}
}
