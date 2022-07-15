package sorting;

public class MergeSort {
   
	public void merge(int arr[],int low,int mid,int high)
	{
		int p=low,q=high,k=0;
		int a[]=new int[high-low+1];
		for(int i=low;i<high;i++)
		{
			if(p>mid)
			{
				a[k++]=arr[p++];
			}
			if(q>high)
			{
				a[k++]=arr[q++];
			}
			if(arr[p]>arr[q])
			{
				a[k++]=arr[q++];

			}
			else
			{
				a[k++]=arr[p++];
			}
		}
		for(int j=0;j<k;j++)
		{
			arr[low++]=a[j];
		}
	}
	public void mergeSort(int arr[],int low,int high)
	{
		if(low <  high)
		{
		int mid =low+high/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);
			
		}
	}
	public static void main(String[] args) {
		int arr[]= {9,8,7,6,4,1};
		new MergeSort().mergeSort(arr, 0,arr.length-1);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}
