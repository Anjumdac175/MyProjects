import java.util.Scanner;

/*The function should return the updated logical size of array.
   int deleteFromPosition(int[] arr, int n, int pos);
*/


public class DeleteFromArray {
	
	public static int DeleteElements(int arr[],int value,int size,int position) {
		
		for(int i=size;i>2;--i)
		{
			arr[i]=arr[i]-1;
		}
		arr[2]=value;
		return size +1;

	}
	

	public static void main(String[] args) {
		
		int[] arr=new int[5];
		System.out.println("Enter elements: ");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Original array is: ");
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Enter which element you want to add in your array? :");
		int val=sc.nextInt();
		System.out.println("Enter the position on which element you want to add in your array? :");
		int pos=sc.nextInt();
		
		//DeleteElements(arr[5],val,5,pos);
		
		
		
		

	}

}
