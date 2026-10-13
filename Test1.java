class Student {

 int rno=101;   //instance vaariable
 String name="Ravi";

void Display() { 
System.out.println(rno+"  "+name);
}
}
class Test1{
public static void main(String []args) {

Student std = new Student();
std.Display();
}
}
