package marklist;

public class StudtMarks {
private void marks() {
int studID= 741020;
System.out.println("student id is " + studID);
String studName= "Kalai";
System.out.println("student Name is " + studName);
int mar1= 10;
System.out.println("mark1 = " + mar1);
int mar2= 20;
System.out.println("mark2 = " + mar2);
int mar3= 30;
System.out.println("mark3 = " + mar3);
int mar4= 44;
System.out.println("mark4 = " + mar4);
int totalMarks= mar1+mar2+mar3+mar4;
System.out.println("Total marks = " + totalMarks );
float avg= totalMarks/4;
System.out.println("Average marks = " + avg);
}
public static void main(String[] args) {
	StudtMarks m = new StudtMarks();
	m.marks();
	
	System.out.println("kalai checkout");
	System.out.println("chnge on selvan");

}
}
