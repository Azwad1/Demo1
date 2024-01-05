import java.util.Scanner;
class FrequencyChar{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();
int ch = sc.nextInt();
int count = 0;
for(int i=0; i<=str.length()-1;i++){
if (charAt(0)=="0"||charAt(1)=="1"||charAt(2)=="2"||
charAt(3)=="3"||charAt(4)=="4"||charAt(5)=="5"||charAt(6)=="6"||
charAt(7)=="7"||charAt(8)=="8"||charAt(9)=="9"||){
count++;
}
}
System.out.println(count);
}
}
