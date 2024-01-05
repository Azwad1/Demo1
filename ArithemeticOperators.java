import java.util.Scanner;
public class ArithemeticOperators{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your first number :");
double num1 = sc.nextDouble();
System.out.println("Enter your second number :");
double num2 = sc.nextDouble();
double sum = num1 + num2;
double difference = num1 - num2;
double product = num1 * num2;
double div = num1 / num2;
double quotient = num1 % num2;
System.out.println("The sum of two numbers : "+sum);
System.out.println("The difference of two numbers : "+difference);
System.out.println("The product of two numbers : "+product);
System.out.println("The division of two numbers : "+div);
System.out.println("The quotient of two numbers : "+quotient);
}
}