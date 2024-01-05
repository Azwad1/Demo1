import java.io.*;
import java .util.*;
class Test1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int inpVar=sc.nextInt();
System.out.println(Test1.printMonth(inpVar));
}
public static String printMonth(int monthno)
{
String month;
switch(monthno)
 {
case 0:{month="JAN";break;}
case 1:{month="FEB";break;}
case 2:{month="MAR";break;}
case 3:{month="APR";break;}
case 4:{month="MAY";break;}
case 5:{month="JUNE";break;}
case 6:{month="JULY";break;}
case 7:{month="AUG";break;}
case 8:{month="SEP";break;}
case 9:{month="OCT";break;}
case 10:{month="NOV";break;}
case 11:{month="DEC";break;}
default: month="INVALID";
}
return month;
}
}