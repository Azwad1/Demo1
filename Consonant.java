import java.util.Scanner;
class Consonants
{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
char c=scob.next().charAt(0);

if(c=='B' || c=='C'||c=='D'||c=='F'||c=='G'||c=='H'||c=='J'||c=='K'||c=='L'||c=='M'||c=='N' || c=='P'||c=='Q'||c=='R'||c=='S'||c=='T'||c=='V'||c=='W'||c=='X'||c=='Y'|| c=='Z' || c=='b'||c=='c'||c=='d'||c=='f'||c=='g'||c=='h'||c=='j'||c=='k'||c=='l'|| c=='m' || c=='p'||c=='q'||c=='r'||c=='s'||c=='t'||c=='v'||c=='w'||c=='x'||c=='y'||c=='z')
System.out.println("YES it is a consonant");
else
 System.out.println("NO it is not a consonant");
}
}