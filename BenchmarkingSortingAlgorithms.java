/**
* This program benchmarks Selection and Arrays Sort to compare which sorting algorithms is faster. 
* Two values of array with exact size are compared. 
* It uses method selectionSort() and Arrays.sort() respectively.
* It prints the output for both arrays 1 and 2 with one array running on selection sort and another ussing arrays sort.
* @author JP de Villeres
* @param  MaxArraySize  the size of the array used for benchmarking will be 1000, 10000 and 100000
*1000 Arrays output is 
*Selection sort time(sec):0.007
*Arrays sort time(sec):0.001
*10000 Array output is
*Selection sort time(sec):0.081
*Arrays sort time(sec):0.007
*100000 Arrays output is 
*Selection sort time(sec):5.318
*Arrays sort time(sec):0.019
*/

package progAssignment1Unit1;
import java.util.*;

public class BenchmarkingSortingAlgorithms { // Compute benchmarks of two different sorting techniques
	public static void main(String[] args) {
		int ArraySize = 100000; 
		int[] sortingArray1 = new int[ArraySize]; 
		int[] sortingArray2 = new int[ArraySize]; 
			for (int i = 0; i < sortingArray1.length; i++) {
				sortingArray1[i]=(int)(Integer.MAX_VALUE * Math.random());
				sortingArray2[i]=sortingArray1[i];
				}
			
	long startTimeArray1 = System.currentTimeMillis(); 
	selectionSort(sortingArray1);    //SelectionSort() method is invoked
	long runTimeArray1 = System.currentTimeMillis() - startTimeArray1; 
	
	long startTimeArray2 = System.currentTimeMillis();
	Arrays.sort(sortingArray2);     //SelectionSort() method is invoked
	long runTimeArray2 = System.currentTimeMillis() - startTimeArray2; 
	
	System.out.println("Selection sort time(sec):"+runTimeArray1/1000.0);
	System.out.println("Arrays sort time(sec):"+runTimeArray2/1000.0); 
	
	}
	
    static void selectionSort(int[] A) { // Sort A in increasing order, using selection sort
    	for (int lastPlace = A.length-1; lastPlace > 0; lastPlace--) {
    			int maxLoc = 0; 
    				for (int j = 1; j <= lastPlace; j++) {
    					if (A[j] > A[maxLoc]) {
    						maxLoc = j;
    						}
    				}
    			int temp = A[maxLoc]; 
    			A[maxLoc] = A[lastPlace];
    			A[lastPlace] = temp;
    			}
		}
}
