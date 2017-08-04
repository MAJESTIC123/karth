import java.util.Scanner;

public class P 21
 {

	public static void main(String[] args) 
{
		Scanner s=new Scanner(System.in);

		System.out.println("Enter the size of array ");

		int n=s.nextInt();
		System.out.println("Enter the element of array ");

		int a[]=new int[n];
	int sum=0;
	int  sum2=0;
	int   s1=0;
	int   s2=0;
	int   count=0;
	int count1=0;
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
	}for(int i=0;i<a.length;i++){
			sum=sum+a[i];
			count++;

			s1=sum/count;

			sum2=0;
			count1=0;

	for(int j=i+1;j<n;j++){
				sum2=sum2+a[j];

				count1++;		
			}s2=sum2/count1;

			if(s1==s2){
	for(int k=0;k<=i;i++){
					System.out.print(a[k]);

				}
        for(int j=i+1;j<n;j++)
{
					System.out.print(" "+a[j]);

				}
i=n;
			}
		}

	}

}
