package defaultp;

public class StringBasic {

	//check for Polindrom
	public void Polindrom(String str) {
		char[] ch=str.toCharArray();
		int low=0;
		int high=ch.length-1;
		boolean isPolindrom=true;
		for(int i=0;i<ch.length/2;i++) {

			if(ch[low]!=ch[high]) {
				isPolindrom=false;
			}
			low++;
			high--;
		}
		if(isPolindrom) {

			System.out.println("polindrom");
		}
		else {
			System.out.println("not a polindrom");
		}

	}
	/////Consonent and vowel Count

	public void CountVowelAndString(String str) {
		int vowel=0;
		int consonent=0;
		char[] ch=str.toCharArray();

		for(char c:ch) {
			if("aeiou".indexOf(c)!=-1) vowel++;
			else if (c>='a' && c<='z') consonent++;

		}

		System.out.println("vowel: "+vowel+"\n"+"consonent: "+consonent);
	}
	
	////reverse String using StringBuilder and RegEx
	public void Regex(String str) {
		
	String sb=new StringBuilder(str).reverse().toString();
	//System.out.println(sb);
	String a="ra jes  h 255252[][ap]03939nd2345677  ";
	String cleaned=a.replaceAll("[\\d+$]","" );
	System.out.println(cleaned);
	
	
	
	
	
	}
	public static void main(String[] args) {
		String str="rajesh";
		StringBasic sba=new StringBasic();
		//sba.Polindrom(str);
		//sba.CountVowelAndString(str);
		sba.Regex(str);


	}

}
