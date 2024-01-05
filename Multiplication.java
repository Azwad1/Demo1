import java.util.Scanner;
class Multiplication{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int num1=sc.nextInt();
System.out.println("Num 1 ="+num1);
int num2 = sc.nextInt();
System.out.println("Num 2 ="+num2);
int mul = num1 / num2;
System.out.println("Multiply = "+ mul);
System.out.println( num1+"/"+ num2 +"=" + mul);
}
}