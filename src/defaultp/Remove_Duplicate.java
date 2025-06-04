package defaultp;

import java.util.HashSet;

public class Remove_Duplicate {

	public void remove(String str) {
		StringBuilder sb=new StringBuilder();
		HashSet<Character> seen=new HashSet<Character>();
		for(char c:str.toCharArray()) {
			if(seen.add(c)) {

				sb.append(c);

			}
		}
		System.out.println(sb);
	}
	public static void main(String[] args) {
		Remove_Duplicate rd=new Remove_Duplicate();
		String str="abcaaaewwewhdhdy";
		rd.remove(str);

	}

}
