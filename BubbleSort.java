import java.util.*;
import java.io.*;
import java.lang.*;
public class BubbleSort
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter  "+n+"  elements :");
		int i,j,temp;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		//Bubble sort code
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}	
		//updated Code in Development branch
		System.out.println("Sorted array using Bubble sort is :");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}

import java.util.*;
import java.io.*;
import java.lang.*;
public class BubbleSort
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter  "+n+"  elements :");
		int i,j,temp;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		//Bubble sort code
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}	
		//
		System.out.println("Sorted array using Bubble sort is :");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}
}
	