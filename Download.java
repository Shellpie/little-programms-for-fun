public class Download {
	public static void main (String[] args){
		for (int i = 1;i<=4;i++){
			if (i<10){
				System.out.println("http://cimg3.163.com/tech/school/21hulian/AutoCAD2007/ID-118-17-0" + i +".swf");
			}else{
				System.out.println("http://cimg3.163.com/tech/school/21hulian/AutoCAD2007/ID-118-17-" + i +".swf");
			}		
		}
	}	
} 