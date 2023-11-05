package method_return;

public class parameter2 {

	public static void main(String[] args) {
		parameter2 lucky = new parameter2();
		lucky.nice("My name is", " Nasrin Akter");
		
		parameter2.lovely(10000, "Nasrin");
		lucky.king();
		
		parameter2.queen();
	}
public void nice(String a, String b) {
	String c = a+b;
	
	System.out.println(c);
	
}
public static void lovely(int a, String b) {
	
System.out.println(a);	
System.out.println(b);	
}
public String king() {
String a = "famous";
System.out.println(a);
return a;	
}
public static double queen() {
double a = 10.55;
System.out.println(a);
return a;	
}
	
}
