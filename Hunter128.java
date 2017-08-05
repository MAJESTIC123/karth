import java.util.*;
public class Hunt 128 
{
public static void main(String[]args)
{
	int a[]={1,2,3,4,5,6};
	int sort[]=new int[a.length];
	
	System.out.println(a.length);
	int temp;
	
	for(int i=0;i<a.length-2;i++)
	{
		for(int j=i+1;j<a.length-1;j++)
		{
			if(a[i]<a[j])
			{
				temp=a[i];
				a[i]=a[j];
				
				a[j]=temp;
			
			
			}
		}
	}
	for(int i=0;i<a.length-1;i++){
		System.out.println(a[i]);
		
	}
	int j=a.length-1;
		for(int i=0;i<(a.length/2);i++){
			System.out.print(a[i]+" "+i+" ");
			
			System.out.print(a[j]+" "+j+" ");
			j--;
		}
	}
}
