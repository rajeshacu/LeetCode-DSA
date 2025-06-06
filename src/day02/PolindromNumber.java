package day02;

public class PolindromNumber {

	public static void main(String[] args) {
		int x=101;
		int rev=0;
		int original=x;
		if(x>0) {
			while(x!=0) {
				int rem=x%10;
				rev=rev*10+rem;
				x=x/10;
				
			}

			if(rev==original) {

				System.out.println("polindrom "+rev);
			}
			else {
				System.out.println("not polindrom");
			}
		}
	}

}
