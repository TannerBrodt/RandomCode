import java.util.Scanner;

public class Practice{


	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		//testCheck(null);
		
//		String word = scan.next();
//		if(isPalinDrome(word)){
//			System.out.println("That word is a PalinDrome.");
//		}
//		else{
//			System.out.println(word + " is not a PalinDrome");
//		}
		
//		double a = scan.nextDouble();
//		int b = scan.nextInt();
//		System.out.println(pow(a,b));
	}
	
	private static double pow(double a, int b){
		if(b == 0){
			return 1;
		}
		else if(b < 0){
			b = b * -1;
			double old = a;
			for(int i = 1; i < b; i++){
				a = a*old;
			}
			return 1/a;
		}
		else{
			double old = a;
			for(int i = 1; i < b; i++){
				
				a = a*old;
			}
			return a;
		}	
		
	}
	
	
	
	private static boolean isPalinDrome(String word){
		
		int i = 0;
		int j = word.length()-1;
		
		while(i <= word.length()/2){
			if(word.charAt(i) != word.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
	
	private static void check(String next) throws NullPointerException{
		next.charAt(0);
		
	}
	
	private static void testCheck(String str){
		
		try{
			check(str);
		}
		catch(NullPointerException e){
			System.out.println("Your string made the exception: " + e);
			System.exit(1);
		}
		
	}

}