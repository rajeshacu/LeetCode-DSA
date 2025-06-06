package day05;

import java.util.Stack;

public class VaildParentheses {

	public Boolean Solution(String str) {
		char[] ch=str.toCharArray();
		Stack<Character> st=new Stack<Character>();
		for(Character c:ch) {
			if(c=='(') {
				st.push(')');

			}
			else if(c=='[') {

				st.push(']');

			}
			else if (st.isEmpty() || st.pop()!=c){

				return false;
			}


		}
		return st.isEmpty();


	}

	public static void main(String[] args) {
		String str="(())";
		VaildParentheses vp=new VaildParentheses();
		boolean sol=vp.Solution(str);
		if(sol) {
			System.out.println("valid");
		}
		else {
			System.out.println("not valid");
		}

	}

}
