import java.util.Scanner;

public class Hunt 88 
{
	public static void main(String[] args)
{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");

		String ss=s.nextLine();
		StringBuffer s1=new StringBuffer(ss).reverse();

		String s2=s1.toString();String n="";String a=s2.substring(0,1);
		String b="";

		for(int i=0;i<s2.length()-1;i++)
{
			for(int j=i+1;j<s2.length();j++)
{
				if(s2.substring(i,i+1).equals(s2.substring(j,j+1)))
{
					 b=s2.replace(s2.charAt(j), '5');break;
				
}                                 else
{
					n=n+s2.substring(j,j+1);break;
				 
}
			
}
}
                             s2=a+n;System.out.print(s2.substring(0,1));
			for(int i=0;i<s2.length()-1;i++)
{
				for(int j=i+1;j<s2.length();j++)
{
					if(s2.substring(i,i+1).equals(s2.substring(j,j+1)))
{
						 b=s2.replace(s2.charAt(j), '5');break;
					
}                                                    else
{
						System.out.print(s2.substring(j,j+1));break;
					
}
				
}
}
			
		//	System.out.print(s2);
}
}
