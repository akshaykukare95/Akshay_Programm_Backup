package javapracticeprogramm;

public class Example11 {
	public static void main(String [] args) {
		String s="ak sh ay ku ka re";
		int count=0;
		for(int i=0;i<s.length();i++) {
			char str1 =s.charAt(i);
			if(str1==' ') {
				count++;
			}
			
		}
		System.out.println(count);
	}
}
