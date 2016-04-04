import java.util.Scanner;
import java.lang.Math;

public class Fuction {
	
	public static void main (String[] args){
		
		Scanner scan = new Scanner(System.in);
		Fuc fuc = new Fuc(0,0);
		System.out.println("选择求出解析式的方式	0:直接输入k，b的值	1:输入两点坐标");
		int i = scan.nextInt();
		switch(i){
			case 0:
				System.out.println("k=");
				double k = scan.nextDouble();
				System.out.println("b=");
				double b = scan.nextDouble();
				fuc.setK(k);
				fuc.setB(b);
				break;
			case 1:
				System.out.println("x1=");
				double x1 = scan.nextDouble();
				System.out.println("y1=");
				double y1 = scan.nextDouble();
				System.out.println("x2=");
				double x2 = scan.nextDouble();
				System.out.println("y2=");
				double y2 = scan.nextDouble();
				fuc.Point_Point(x1, y1, x2, y2);
				break;
		}
		fuc.Display();
		
		System.out.println("选择功能	0	1:已知x求y		2:已知y求x		3:求与坐标轴围成的三角形的面积");
		int j = scan.nextInt();
		switch(j){
			case 1:
				System.out.println("x=");
				double x = scan.nextDouble();
				System.out.println("y=" + fuc._X_Y(x));
				break;
			case 2:
				System.out.println("y=");
				double y = scan.nextDouble();
				System.out.println("x=" + fuc._Y_X(y));
			case 3:
				System.out.println(fuc.sq());
				break;
		}
	}
}

class Fuc {
	
	double k,b;
	
	Fuc(double _k,double _b){
		k = _k;
		b = _b;
	}
	void Point_Point(double x1,double y1,double x2,double y2){
		double k = (y1-y2)/(x1-x2);
		double b = y1-k*x1;
		setK(k);
		setB(b);
	}

	double _X_Y(double x){
		double y = k*x+b;
		return y;
	}

	double _Y_X(double y){
		double x = (y-b)/k;
		return x;

	}

	double sq(){
		double s = Math.abs(this._X_Y(0) * this._Y_X(0) / 2);
		return s;	
	}

	void Display(){
		if (b>0){
			System.out.println("y=" + k + "x+" + b);
		}
		else if (b<0){
			System.out.println("y=" + k +"x" + b);
		}
	}

	void setK(double k){
		this.k = k;
	}
	
	void setB(double b){
		this.b = b;
	}
}