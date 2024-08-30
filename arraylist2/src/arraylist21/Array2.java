package arraylist21;

public class Array2 {

	
	
	public static void main(String[] args) {
		 
		
		Object[][] arr = new Object[2][2];    //[][] means 2 d array
		
		arr[0][0]= "anurag";
		arr[0][1]="bhujang";
		arr[1][0]=12;
		arr[1][1]=1;
	
		
		 for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.print(arr[i][j]   + "  ");
	            }
	            System.out.println();
		
		System.out.println("good");
		
	}
}
}