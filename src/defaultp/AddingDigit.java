package defaultp;

public class AddingDigit {

	public static void main(String[] args) {
		String str="a1b2c3d4";
		StringBuilder result=new StringBuilder();
		for(int i=0;i<str.length();i+=2) {
			
			char c=str.charAt(i);
			int count=Character.getNumericValue(str.charAt(i+1));
			
			
			for(int j=0;j<count;j++) {
				
				result.append(c);
			}
			
			
		}
		System.out.println(result);
	}

}
