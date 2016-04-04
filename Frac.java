class Fraction{

	int al,bl,GCD;
	double a,b;

	Fraction(double a,double b){
		this.setA(a);
		this.setB(b);
		try{
			double i =  a / b;
		}catch(ArithmeticException e){
			System.out.println("分母不能为0！");
			System.exit(-1);
		}
	}

	void display(){
		System.out.println(a + "/" + b);
	}

	void displayLowest(){
		System.out.println(al + "/" + bl);
	}

	void setA(double a){
		this.a = a;
	}

	void setB(double b){
	this.b = b;
	}

	int getLowest(){
		this.getInt();
		al =(int) a;
		bl =(int) b;
		GCD = 1;
		double e = 0;
		if (al*bl > 0) {
			if (Math.abs(al) > Math.abs(bl)){
				e = Math.abs(bl);
				al = Math.abs(al);
				bl = Math.abs(bl);
			}else{
				e = Math.abs(al);
				al = Math.abs(al);
				bl = Math.abs(bl);
			}
		} else if (a*b < 0) {
				if(Math.abs(al) < Math.abs(bl)) {
					e = Math.abs(al);
				} else{
					e = Math.abs(bl);
				}
		}else {
			al = 0;
			bl = 0;
			GCD = 0;
		}
		for (int i =(int)e;i >= 1;i--){
			if (a % i == 0 && b % i == 0) {
				GCD = i;
				al = al / i;
				bl = bl / i;
				break;
			}
		}
		return 0;
	}

	void getInt(){
		for (int i = a > b ? (int)a : (int)b; ;i++) {
			if (a * i % 1 == 0 && b * i == 0){
				a = a * i;
				b = b * i;
				break;	
			}
		}
	}

	void displayGCD(){
		System.out.println(GCD);
	}

}

public class Frac{
	public static void main (String args[])	{
		Fraction f = new Fraction(-3.2,1.25);
		f.getInt();
		f.display();
		f.getLowest();
		f.displayLowest();
		f.displayGCD();
	}
}