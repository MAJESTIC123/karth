public class Sum {
	

	public static int output;
	static int k=0;
	public static void main(String[] args) {
		Sum s=new  Sum();
s.userMethod(1234);
System.out.println(output);
	}
	public  void userMethod(int input){
		int y=input;
		
		while(y!=0){
			k+=y%10;
			y=y/10;
		}
		input=input/10;
		if(input >0){
			userMethod(input);
		}
		output=k;
	}

}