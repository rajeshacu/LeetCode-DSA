package day05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateCharacter {

	public void Solution(String str) {
		Map<Character, Integer> map= new HashMap<Character, Integer>();
		char[] ch=str.toCharArray();
		for(char c:ch) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
			for(Map.Entry<Character,Integer> entry:map.entrySet()) {
				if(entry.getValue()>1) {


					System.out.println(entry.getKey()+":"+entry.getValue());
					
				}
			}

		
	}


	public static void main(String[] args) {
		DuplicateCharacter dc=new DuplicateCharacter();
		String str="apple";
		dc.Solution(str);



	}

}
