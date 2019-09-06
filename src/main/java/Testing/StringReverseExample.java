package Testing;

public class StringReverseExample {

	public static void main(String[] args) {


		String str = "10";
		String result="";
/*		int result = Integer.parseInt(str);			
		System.out.println(result);
*/
		
		for(int i=str.length()-1;i>=0;i--) {
		
			result=result+str.charAt(i);
		}
		System.out.println(result);
	if(str.contentEquals(result)) {
			System.out.println("Polindrome");
		}
		else {
		System.out.println("Not a Polindrome");
	}
	}
}
