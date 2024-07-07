package javase.core;

public class ArrayConcept {

	public static void main(String[] args) {
		//declaration of array or creation of array
		int a[] = new int[5];
		a[0]  = 78;
		a[1]  = 88;
		a[2]  = 70;
		a[3]  = 98;
		a[4]  = 68;
		
		System.out.println(a[0]);
		
		//store marks of 5 students  
		int students[][] = new int[2][6];
		students[0][0] = 40;
		students[0][1] = 40;
		students[0][2] = 40;
		students[0][3] = 40;
		students[0][4] = 40;
		students[0][5] = 40;
		
		students[1][0] = 70;
		students[1][1] = 70;
//		students[1][2] = 70;
//		students[1][3] = 70;
//		students[1][4] = 70;
		
		for(int i=0;i<students.length;i++) {
			for(int j=0;j<students[i].length;j++) {
				System.out.print(students[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	
		
	}

}
