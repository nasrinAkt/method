package method_return;

public class multiple_method {

	public static void main(String[] args) {
	int a = 100;
	int b = 200;
	int c = a+b;
	System.out.println(c);
	
	double d = 10.50;
	double e = 20.50;
	double f = d+e;
	System.out.println(f);
	
	char g = 'n';
	System.out.println(g);
	
	String top = "building";
	String down = "First floor of the ";
	String total = down+top;	
	System.out.println(total);
	
	multiple_method life = new multiple_method();
	life.floor();
	multiple_method.roof();
	life.chair();
	multiple_method.table();
	life.chandan("nasrin", 22.50);
	multiple_method.neem(1000, 500);
life.water("nasrin", 'n');
	}
public void floor() {//non-static method
String name	= "I live in Bangladesh";
String full = " and this is my motherland.";
String all = name+full;
System.out.println(all);
	
	
}
public static void roof() {//static method
char myFirstnameInitial = 'n';
System.out.println(myFirstnameInitial);
	
	
}
public int chair() {//return type non-static method
	int a = 100;
	int b = 200;
	int c = a*b;
	System.out.println(c);
	return c;
		
}
public static double table() {//return type static method
	double a = 40.50;
	System.out.println(a);
	return a;
}
public void chandan(String a, double b) {//parameter non sattic method
	System.out.println(a);
	System.out.println(b);
}
public static void neem(int a, int b) {//parameter
	int c = a-b;
System.out.println(c);	
	
}
public String water(String a, char b) {//return type and parameter method in non static
System.out.println(a);	
System.out.println(b);	
return a;

}

}
