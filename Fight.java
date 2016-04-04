import java.util.Scanner;

public class Fight{
	
	public static void main(String[] args) throws Exception{
	
		while (true) {
			Scanner scan = new Scanner(System.in);
			int a = scan.nextInt();	
			if (a == 0){
				break;	
			}else{
				;
			}
			double attacker =  Math.random()*10;
			double guarder =  Math.random()*10;
			System.out.println("a=" + attacker + "g=" +guarder);	
			if (attacker == guarder){
				System.out.println("Nobody wins");
			}else{
				System.out.println( attacker > guarder ? "Capture successfully" : "Capturing failed" );
				//attacker > guarder ? System.out.println("Capture successfully") : System.out.println("Capturing failed")
			}
			
		}
		
	}
		
}