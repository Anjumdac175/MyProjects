import java.util.Scanner;

public class InsertIntoArray {
public static int InsertElement(int arr[],int value,int size,int position) {
		
		for(int i=size;i>position;--i)
		{
			arr[i]=arr[i-1];
		}
		arr[position]=value;
		
		
		
		return size +1;

	}
	
	public static void main(String[] args) {
		
		int[] arr=new int[8];
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
		int n = InsertElement(arr,val,5,pos);
		
		System.out.println(" After inserting ,array is: ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
