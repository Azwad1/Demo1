class Idcard
{
private String college_name;
private String college_address;
private int ay_start;
private int ay_end;
private int id;
private String student_name;
private String course_name;
private String aadhar_no;
public void setCollege_name(String college_name){this.college_name=college_name;}
public void setCollege_address(String college_address){this.college_address=college_address;}
public void setAy_start(int ay_start){this.ay_start=ay_start;}
public void setAy_end(int ay_end){this.ay_end=ay_end;}
public void setId(int id){this.id=id;}
public void setStudent_name(String student_name){this.student_name=student_name;}
public void setCourse_name(String course_name){this.course_name=course_name;}
public void setAadhar_no(String aadhar_no){this.aadhar_no=aadhar_no;}
public String getCollege_name(){return college_name;}
public String getCollege_address(){return college_address;}
public int getAy_start(){return ay_start;}
public int getAy_end(){return ay_end;}
public int getId(){return id;}
public String getStudent_name(){return student_name;}
public String getCourse_name(){return course_name;}
public String getAadhar_no(){return aadhar_no;}
}
class StudentIdcard
{
public static void main(String args[])
{
Idcard ic = new Idcard();
ic.setCollege_name("MOTHER THERESA");
ic.setCollege_address("MELUMOI");
ic.setAy_start(2023);
ic.setAy_end(2026);
ic.setId(12345);
ic.setStudent_name("Azwad");
ic.setCourse_name("CSE");
ic.setAadhar_no("123456789012");
System.out.println("College name:"+ic.getCollege_name());
System.out.println("College address:"+ic.getCollege_address());
System.out.println("Ay start:"+ic.getAy_start());
System.out.println("Ay end:"+ic.getAy_end());
System.out.println("ID:"+ic.getId());
System.out.println("Student name:"+ic.getStudent_name());
System.out.println("Course name:"+ic.getCourse_name());
System.out.println("Aadhar no:"+ic.getAadhar_no());
}
}
