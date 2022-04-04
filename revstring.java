package Javapractice;

public class revstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String reversed =reversemethod("Priyanka");
		System.out.println("reverse string is "+reversed);
	}
	
	
	
	static String reversemethod(String rev) {
		String rev1="";
		for (int i=(rev.length()-1);i>=0;--i) 
		{
			rev1=rev1+rev.charAt(i);
		}
		
		return rev1;
	}

}
