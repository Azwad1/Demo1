import java.util.Scanner;
class InputMonthNumber
{
public static void displayMonth(int m)
{
switch(m)
{
case 0:System.out.println("JAN");break;
case 1:System.out.println("FEB");break;
case 2:System.out.println("MAR");break;
case 3:System.out.println("APR");break;
case 4:System.out.println("MAY");break;
case 5:System.out.println("JUNE");break;
case 6:System.out.println("JULY");break;
case 7:System.out.println("AUG");break;
case 8:System.out.println("SEP");break;
case 9:System.out.println("OCT");break;
case 10:System.out.println("NOV");break;
case 11:System.out.println("DEC");break;
default:System.out.println("INVALID");
}
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int dm;
dm = scob.nextInt();
displayMonth(dm);
}
}