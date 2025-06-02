package defaultp;

public class LongestCommonPrefix {
	public  String Prefix(String[] str) {
		String prefix=str[0];
		for(int i=1;i<str.length;i++) {


			while(!str[i].startsWith(prefix)) {

				prefix=prefix.substring(0,prefix.length()-1);

			}

		}
		return prefix;



	}
	public static void main(String[] args) {
		LongestCommonPrefix lp=new LongestCommonPrefix();
		String[] str= {"flower","flow","flight"};
		System.out.println(lp.Prefix(str));


	}

}
