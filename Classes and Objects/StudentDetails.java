class Student{
int rollno;
String Name;
static String tutor;

Student(int rollno,String Name){
this.rollno=rollno;
this.Name=Name;
}
void show(){
System.out.println(rollno+" "+Name+" "+tutor);
}
static{
tutor="Prasanth";
}
}
class StudentDetails{
public static void main(String arg[]){
Student s1=new Student(12,"Anusree");
Student s2=new Student(15,"Arathi");
Student s3=new Student(17,"Arundhathi");

s1.show();
s2.show();
s3.show();
}
}