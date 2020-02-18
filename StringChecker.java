package test;
public class StringChecker {
	
	public boolean areFirstAndLast2CharsTheSame(String str)
	{
		int length = str.length() ; 
		char firstChar = str.charAt(0);
		char secondChar = str.charAt(1);
		char lastChar = str.charAt(length-1);
		char beforeLastChar = str.charAt(length-2);
		if(firstChar == beforeLastChar && secondChar == lastChar  )
		{
			return true ;
		}
		else 
		{
		return false ;
		}
		}
	  
	public static void main(String[] args) {
		
		StringChecker s1 = new StringChecker() ; 
		
		boolean R = s1.areFirstAndLast2CharsTheSame("AABBAAB"); 
		System.out.println(R);
		 R = s1.areFirstAndLast2CharsTheSame("ABBAB"); 
		System.out.println(R);
	
	}
	
	} 