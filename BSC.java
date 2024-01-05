class BSC{
private int age;      //instance variable
public void setAge(int age)      //local variable
{
if (age<0)this.age=0;
else
this.age=age;
}
public int getAge()     //get age = to retrive data
{
return this.age;
}
class BCA1{
public static void main(String args[])
{
System.out.println("Good Morning");
BSC ob=new BSC();
ob.setAge(10);         //set age=  to initialize instance variable
System.out.println("Age:"+ob.getAge());
}
}
}