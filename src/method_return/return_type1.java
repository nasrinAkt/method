package method_return;

public class return_type1 {

	public static void main(String[] args) {
		
		return_type1 life = new return_type1();
		life.tom(); 
		return_type1 old = new return_type1();
		old.jerry(500, 600); 

	}
public int tom() {
int a = 100;
int b = 200;
int c = a+b;
System.out.println(c);
return c;
	
	
}
public int jerry(int a, int b) {
	int c = a+b;
	System.out.println(c);
	return c;
	
}


	
	
}
