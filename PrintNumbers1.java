import java.util.Scanner;
class PrintNumbers1 {
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();
        for (int i = 0; i <= n; i=i+5) {
            System.out.print(i+",");
        }
    }
}