class Employee
{
int eid;
String ename;
String field;
void insertRecord(int r, String n, String f)
{
eid=r;
ename=n;
field=f;
}
void displayinformation()
{
System.out.println(eid+" "+ename+" "+field);
}
}
class TestEmployee2
{
public static void main(String args[])
{
Employee e1=new Employee();
Employee e2= new Employee();
Employee e3=new Employee();
e1.insertRecord(111,"Karan","Developer");
e2.insertRecord(222,"Aryan","Programmer");
e3.insertRecord(333,"Rahul","Tech");
e1.displayinformation();
e2.displayinformation();
e3.displayinformation();}
}