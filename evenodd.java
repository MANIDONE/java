
class evenodd {
	static boolean isEven(int n)
	{
		boolean isEven = true;
		
		for (int i = 1; i <= n; i++) 
			isEven = !isEven;
			
		return isEven;
	}
	public static void main(String args[])
	{
		int n = 012;
		/* if(isEven(n))
			System.out.println("Even");
		else
			System.out.println("Odd");
           */      ////another method of even or odd
            if((n & 1)==0){
                System.out.println("Even");
            }else{
            System.out.println("Odd");
            }
		
	}
}





