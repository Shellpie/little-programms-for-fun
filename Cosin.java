import java.util.Scanner;

public class Cosin{
	public static void main (String args[]) {
		Cos c = new Cos(2,4,3);	
		c.cal();
	}
}

class Cos {
	
	int a,b,C;
	
	Cos  (int a , int b , int C){
		this.a = a;
		this.b = b;
		this.C = C;
		
	}
	
	public int cal (){
		System.out.println(a+b+C);
		return 0;
	}

}
