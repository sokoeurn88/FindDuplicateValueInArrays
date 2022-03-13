package findduplicatevalueinarrays;

public class FindDuplicateValueInArrays {

	public static void main(String[] args) {
		
		int[] myArrays = {1, 2,2, 3, 4, 4, 5, 5};
		
		for(int i = 0;i<myArrays.length;i++) {
			
			for(int j = i+1;j<myArrays.length;j++) {
				
				if(myArrays[i]== myArrays[j]) {
					
					System.out.println(myArrays[j]);
				}
				
			}
			
		}

	}

}
