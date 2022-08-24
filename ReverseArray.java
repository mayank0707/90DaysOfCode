import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter no. of elements: ");
		int n=s.nextInt();
		int[] arr=new int[n];
		System.out.print("Enter elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		s.close();
		reverseArray(arr);
		System.out.println("Reverse Array: "+Arrays.toString(arr));
	}

	static void reverseArray(int[] arr) { //Reversing the array using 2-pointer
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			swap(arr,start,end);
			start++;
			end--;
		}
	}

	static void swap(int[] arr, int start, int end) { //Swapping two elements 
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}

}
