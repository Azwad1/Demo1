class Student{
private int id;  
private String name;  
public void setId(int id) {this.id=id;}    
public void setName(String name) {this.name=name;}
public int getId() {return id;}  
public String getName(){return name;}
}
class Student1{
public static void main(String args[])
{
Student ob=new Student();
ob.setId(23455);       
ob.setName("Azwad");
System.out.println("Id:"+ob.getId());
System.out.println("Name:"+ob.getName());
}
}
