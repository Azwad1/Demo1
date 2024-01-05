import java.io.*;
class BufferedReader1{
public static void main(String args[]) throws Exception{
InputStreamReader  r = new InputStreamReader(System.in);
BufferedReader1 br = new BufferedReader1(r);
System.out.println("Enter your name ");
String name = br.readLine();
System.out.println("Welcome "+name);
}
}