class UnaryNot{
public static void main(String args[]){
boolean cond = true;
Scanner sc= new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
System.out.println(" Cond is "+cond);
System.out.println("Var 1 = "+ a);
System.out.println("Var 2 = "+b);

System.out.println(" Now cond is : "+! cond);
System.out.println("!(a<b) = "+!(a<b));
System.out.println("!(a>b) = "+!(a>b));
}
}