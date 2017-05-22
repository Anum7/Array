import java.util.Arrays;
import java.util.*;

public class Lab5 {

	public static void main(String[] args) {
		int v=5;  												//Element to add
		int index=3;											//Index at which add the Element
		
		int[] array = new int[5]; 								//Creating an array
		int size= array.length;
		
		Random ran = new Random();  							//creating Random elements for an array
		for(int i=0; i<size; i++){
			int j= ran.nextInt(10-1+1)+1;
			array[i]=j;
		}
		
		int[] newArray1 = Arrays.copyOf(array, array.length);  //making a copy of original array
		newArray1=insertBeginning(newArray1,v);				   //Calling Method
		System.out.println("insertBeginning method");
		toString(array,newArray1);
		
		int[] newArray2 = Arrays.copyOf(array, array.length);  //making a copy of original array
		newArray2=insertEnd(newArray2,v);					   //Calling Method
		System.out.println("insertEnd Method");				   
		toString(array,newArray2);							   //Calling toString to print the result
		
		int[] newArray3 = Arrays.copyOf(array, array.length);  //making a copy of original array
		newArray3=insertIndex(newArray3,index, v);			   //Calling Method
		System.out.println("InsertIndex method");
		toString(array,newArray3);							   //Calling toString to print the result
		
		int[] newArray4 = Arrays.copyOf(array, array.length);  //making a copy of original array
		newArray4=reverseArray(newArray4);				       //Calling Method
		System.out.println("Reverse Array method");
		toString(array,newArray4);							   //Calling toString to print the result
	}
	public static int[] insertBeginning(int[]array,int v){	   	
		//In this method inserting an integer at the beginning of the array. Shifting the elements. Size of the array remains the same.
		int pos=0;
		int[] result = new int[array.length];				   
		/*for(int i=0; i<pos; i++){
			array[i]=array[i];
		}*/
		result[pos]=v;
		for(int i=pos+1; i<array.length; i++){
			result[i]=array[i-1];
		}
		return result;
	}
	
	public static int[] insertEnd(int[] array, int v){        	
		//inserting an integer at the end of the array. Shifting the elements. Size of the array remains the same
		int pos = array.length-1;
		int[] result = new int[array.length];
	/*	for(int i=array.length-1; i>pos; i--){
			array[i]=array[i];
		}*/
		result[pos]=v;
		for(int i=pos-1; i>=0; i--){
			result[i]=array[i+1];
		}
		return result;
	}
	
	public static int[] insertIndex(int[] array, int p, int v){  
		//inserting v at index p of the array. Conserving all elements. Size of the array is increasing by one.
		int length = array.length;
		int[]a = new int[length+1];
		
		for(int i=0; i<p;i++){
			a[i]=array[i];
		}
		a[p]=v;
		for(int i=p+1; i<a.length;i++){
			a[i]=array[i-1];
		}
		
		return a;
	}
	
	public static int[] reverseArray(int[]array){              //Reverse the array
		int l=array.length;
		for(int i=0; i<l / 2; i++){
			int temp= array[i];
			array[i]= array[l-i-1];
			array[l-i-1]= temp;
		}
		return array;
	}
	
	public static void toString(int[] array, int[]newArray){	//print the elements of array.
		System.out.println("The Original array "+ Arrays.toString(array));
		System.out.println("New Array: "+Arrays.toString(newArray));
		System.out.println();
	}

}
