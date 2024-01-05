import java.util.Scanner;
class Alphabet{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter a character : ");
char input = sc.next().charAt(0);
if (Character.isLetter(input)){
System.out.println(input + " is an alphabet " );}
else{
System.out.println(input +" is not an alphabet ");}
sc.close();
}
}