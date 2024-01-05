import java.util.Scanner;
class Diff{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
int num2 = sc.nextInt();
int difference = Math.abs( num1 - num2 );
System.out.println(difference);
}
}