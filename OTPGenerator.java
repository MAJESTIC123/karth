package Lp12;
public class OTPGenerator {
	public static String output1;
	
	public static void main( String [] args ) {
	userMethod("GoodnamE", 61741978349L, "Current" ); 
	System.out.println( output1 ); 
	}
	public static void userMethod(String input1, long input2, String input3 ) {
		String a=input3.substring(0, 2);
		//System.out.println(a);
		long b=input2/1000000000;
		
	   long c=b/10;
		//System.out.println(c);
		long d=input2/1000000;
		//System.out.println(d);
		long g=0;
		long j=0;
		long g1=0;
		long j1=0;
		while(d>0)
		{
			g=g+d%10;
			d=(d/10);
			if(d==0 && g>9){
				d=g;
				g=0;
			}
			}
				//System.out.println(g);
		
			//System.out.println(j);
			String e=input1.substring(0, 1);
			//System.out.println(e);
			long q=input2%1000000;
			//System.out.println(q);
			long f=q/10;
			//System.out.println(f);
			while(f>0)
			{
				g1=g1+f%10;
			    f=(f/10);
			    if(f==0 && g1>9)
			    {
			    	f=g1;
			    	g1=0;
			    }
			
				}
				//System.out.println(g1);
				
			//System.out.println(j1);
			String r=input1.substring(input1.length()-1,input1.length());
			//System.out.println(r);
			long v=input2%10;
			//System.out.println(v);
			
			
			
			
		
		//long[] d=new long[(int) input2];
		//for(int i=0;i<d.length;i++)
		//{
			
		
		//}
		//while(input2!=0)
		//{
			//long d=input2%10;
		//}	
			
			
			
	
	
		
output1=(a+c+g+e+g1+r+v);
	}
}

