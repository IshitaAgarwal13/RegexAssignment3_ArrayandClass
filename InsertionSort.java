package Array;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no. of elements in array:");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements in array:");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
		}
		
		System.out.println("Sorted array is:");
		for(int i:arr) {
			System.out.print(i+"  ");
		}
		sc.close();

	}

}
