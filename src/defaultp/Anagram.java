package defaultp;

import java.util.*;
import java.util.Arrays;

public class Anagram {
	
	public Boolean Solution(String str,String str1) {
		char[] ch=str.toCharArray();
		char[] ch1=str1.toCharArray();
		Arrays.sort(ch);Arrays.sort(ch1);
		return Arrays.equals(ch, ch1);
		
		
		
	}
	public static void main(String[] args) {
		Anagram a=new Anagram();
		String str="rajshe";
		String str1="rajshe";
		Boolean b=a.Solution(str,str1);
		if(b) {
			System.out.println("anagram");
			
		}
		else {
			System.out.println("not anagram");
		}
			
		
	}

}
