import java.util.*;
public class least {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
        String num=input.next();
        int m=input.nextInt();
        int ar=num.length();
        if(m<ar)
        {
        	StringBuffer sb=new StringBuffer(num);
        	char[] ar=num.toCharArray();
        	for(int i=0;i<ar-1;i++)
	        	for(int j=i+1;j<ar;j++)
        		{
	        		if(((int) arr[i])<((int) arr[j]))
        			{
	        			char t;
        				t=arr[i];
        				arr[i]=arr[j];
        				arr[j]=t;
        			}
        		}
        	StringBuilder sa=new StringBuilder(num);
        	for(int i=0;i<m;i++)
        	{
	        	sa.deleteCharAt(sa.toString().indexOf(arr[i]));
	        }
	        System.out.println(sa.toString());
        }
        else
        	System.out.print("Error");
        input.close();
	}

}