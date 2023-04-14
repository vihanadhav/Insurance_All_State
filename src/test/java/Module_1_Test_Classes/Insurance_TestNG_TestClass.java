package Module_1_Test_Classes;

import java.util.HashMap;
import java.util.Set;

public class Insurance_TestNG_TestClass {
	
	
	public static void main(String[] args) 
	   {
		
		   String org="adhavkiran93@gmail.com";      //a=?  b=? c=?  d=?
		   
		   HashMap<Character, Integer>   mp=new  HashMap<Character, Integer>();		   
		   
		   
		   for(int i=0;  i<org.length();  i++)
		   {
			   
			   char  charvalue=org.charAt(i);
			   
			   if(mp.containsKey(charvalue))
			   {
				   
				   mp.put(charvalue, mp.get(charvalue)+1);
				   
			   }
			   else
			   {
				   
				   mp.put(charvalue, 1);
			 
			   }
			   
			   
		   }
		   
		   Set<Character>    keys=mp.keySet();
		   
		   for(Character  key:keys)
		   {
			   
			   System.out.println(key+ ":"+ mp.get(key));
			   
		   }
		   
	   }

}
