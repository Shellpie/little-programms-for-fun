class YSFJ {
	
	int a,b,c,a1,b1,a2,b2;
	
	YSFJ (int a,int b,int c) {
		this.a = a; 
		this.b = b;
		this.c = c;	
	}
	
	public void getYSFJ () {
		System.out.println("0");
		if (a == 1) {
		 simpleYSFJ();	
		}else{
			defaultYSFJ();	
		}
			
	}
	
	private int simpleYSFJ(){
		System.out.println("1");
		for (int i = 1; i < c/2+1; i++){
			System.out.println("2");
			double j = c/i;
			System.out.println(i + " "  + j);
			if (c/i + i == b){
				a1 = a2 = 1; 
				b1 = i;	
				b2 = c/i;
				return 0;
			}
		}
			for (int i = -c; i < 0; i++){
				double j = c/i;
				System.out.println(i + " "  + j);
				if (j + i == b && c % i == 0 && i * j == c){
				a1 = a2 = 1;
				b1 = i;	
				b2 = c/i;
				return 0;
				}
			}
		return 0;
	}
	
	private int defaultYSFJ () {
		return 0;
	}
	
	public void display(){
		System.out.println( "(" + a1 + "x+" + b1 +	")(" + a2 + "x+" + b2 +")" );
	}
	
}
