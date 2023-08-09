package array;

public class JaggedArray {

	    public static void main(String[] args) {
	        
	        int[][] jaggedArray = new int[3][];
	        
	        
	        jaggedArray[0] = new int[] { 1, 2, 3 };
	        jaggedArray[1] = new int[] { 4, 5, 6, 7 };
	        jaggedArray[2] = new int[] { 8, 9 };
	        
	        
	        System.out.println("Jagged Array:");
	        for (int i = 0; i < jaggedArray.length; i++) 
	        {
	            for (int j = 0; j < jaggedArray[i].length; j++) 
	            {
	                System.out.print(jaggedArray[i][j] + " ");
	            }
	            System.out.println(); 
	        }
	    }
	}


