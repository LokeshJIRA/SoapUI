package Testing;

public class ArrayExample {

	public static void main(String[] args) {
		
		
		int abc[][]= {{1,10,51},{3,12,7},{11,2,9}};
		int min=abc[0][0];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				//Min and max number of array change < to > symbol
				if(abc[i][j]>min) {
					min=abc[i][j];
				}
			}
		}
		System.out.println(min);
	}
}
