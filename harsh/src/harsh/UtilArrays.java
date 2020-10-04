package harsh;
import java.util.Arrays;
import java.util.List;


public class UtilArrays {
	
	//________https://www.baeldung.com/java-util-arrays_____________//
	
	public void creating(int[] array1) {
		
		//___1.CopyofRange_|_2.Copyof_|_3.Fill_|_4.equals_|5._deepequals_|
		System.out.println("\nOriginal array1 = "+Arrays.toString(array1));
		
		//CopyofRange(arr, startingIndex, FinalIndex)
		int[] array2 = Arrays.copyOfRange(array1, 2, 4);             
		System.out.println("\nCopied 2-4 items from array1 to array2 = "+Arrays.toString(array2));   
		
		//Copyof(arr, length)
		int[] array3 = Arrays.copyOf(array1, 4);     
		System.out.println("\nCopied 4 items from array1 to array2:"+Arrays.toString(array3));
		
		//fill(arr, value)
		Arrays.fill(array3, 0);
		System.out.println("\nFilled array3 with 0 = "+Arrays.toString(array3));
		
		//equals(arr1, arr2)
		System.out.println("\narray1 and array2 equality = "+Arrays.equals(array1, array2));    
		  
		//deepequals(obj1, obj2)
		Object[] n1 = new Object[] { "chapter one", "chapter two" };
		Object[] n2 = new Object[] { "chapter one", "chapter two" };
		System.out.println("\nObj1 and Obj2 equality = "+Arrays.deepEquals(n1, n2));
		
	}
	
	public void sortsearching (int[] array1) {
		
		System.out.println("\nOriginal Array = "+Arrays.toString(array1));
		//Sorting and Searching
		
		//sort
		Arrays.sort(array1);
		System.out.print("\nSorted Array1 = "+Arrays.toString(array1));
		
		//binarySearch(array, key)
		System.out.println("\n\nSearched 78, output = "+Arrays.binarySearch(array1, 78));
		
		//covert array into stream - find way to print it
		Arrays.stream(array1);
		
	}

	public void transform(int [] array1) {
		
		//toString().....we can get a readable version of our original array
		System.out.println("\nConvert hash code "+array1+" to readable vern with .toString() = "+Arrays.toString(array1));
		
		//deepToString()....must use the deep version to print the contents of nested arrays
		int [][] arr = {{23,45,56,567,53},{54,65,34,53}};
		System.out.println("\nConerting multidimentional array with .toString() = "+Arrays.toString(arr));
		System.out.println("Conerting multidimentional array with .deepToString() = "+Arrays.deepToString(arr));
		
		List list1 = Arrays.asList(array1);
		System.out.println("Array asList = "+Arrays.toString(array1));
		System.out.println("Array asList = " + list1);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {12, 32, 67, 34, 78, 45};
		UtilArrays a1 = new UtilArrays();
		//a1.creating(arr);
		a1.sortsearching(arr);
		a1.transform(arr);
		

	}

}
