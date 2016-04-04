public class FC{
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("a=");
		double A = scan.nextLine();
		System.out.println("b=");
		double B = scan.nextLine();
		System.out.println("c=");
		double C = scan.nextDouble();
		double Delta = B*B-4*A*C;
		scan.close();
		System.out.printIn("根的判别式的值为"+Delta);
		double x1 = (-B+Math.sqrt(Delta))/2*A;
		double x2 = (-B-Math.sqrt(Delta))/2*A;
		if (Delta > 0){
			System.out.println("方程有两个不相等的实数根	X1=" + x1 +" X2=" + x2);
		}else if (Delta == 0){
			System.out.println("The equation has a root two equal	X1=X2=" + x1);
		}else if (Delta < 0){
			System.out.println("方程无实数根");
		}
	}
}
