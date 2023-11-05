package method_return;

public class parameter_nonstatic {

	public static void main(String[] args) {
		parameter_nonstatic rose = new parameter_nonstatic();
		rose.flower("red", " color");
		
		parameter_nonstatic.full();
		
		parameter_nonstatic purple = new parameter_nonstatic();
		purple.blue(200, 300);
		
	}
public void flower(String a, String b) {
String c = a+b;
System.out.println(c);
	

}
public static char full() {//return type
char a = 'n';
System.out.println(a);
return a;	
	
}
public int blue(int a, int b) {//return parameter
	int c = a+b;
	System.out.println(c);
	return c;
	
}
	
}
