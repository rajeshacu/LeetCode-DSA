package defaultp;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
	public 	Map<Character,Integer> Solution(String str){
		
		HashMap< Character, Integer> map= new HashMap<Character, Integer>();
		char[] ch=str.toCharArray();
		for(char c:ch) {
			map.put(c,map.getOrDefault(c,0)+1);
		}
		
		return map;
	}
	
	
	public static void main(String[] args) {
		CharacterCount cc= new CharacterCount();
		String str="apple";
		System.out.println(cc.Solution(str));
		
		
	}

}
