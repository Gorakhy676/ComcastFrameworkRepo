package DDT;

public class GenerateAlphaNumericRandomdata {

	public static void main(String[] args) {
		int n=20;
		//choice a character random from this String
		String AlphaNumericString="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789abcdefghijklmnopqrstuvwxyz";
		
		//create StringBuilder size of AlphaNumericString
		StringBuilder sb=new StringBuilder(n);
		for(int i=0;i<n;i++) {
			
			//generate a random number between 0 to AlphaNumericString variable Length
			int index=(int)(AlphaNumericString.length()*Math.random());
			
			//add character ine by one of sb
			sb.append(AlphaNumericString.charAt(index));
		}
		
		System.out.println(sb);
	}

}
