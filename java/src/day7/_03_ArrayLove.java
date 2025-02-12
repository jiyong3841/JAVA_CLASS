package day7;

public class _03_ArrayLove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] charArr = {'1', 'L', 'O', 'V', 'E', '3', '2'};
		String love = "";
		
		for(int i = 0; i < charArr.length; i++) {
			int word = charArr[i];
			if((word >= 65 && word <= 90) || (word >= 97 && word <= 122)) {
				//아스키코드(ASCII) : 65~90 대문자 A ~ Z
				//아스키코드(ASCII) : 97~122 소문자 a ~ z
				love += (char)word;
			}		
		}
		System.out.println("단어 : " + love);
	}

}
