package stringmethods;

public class Method1 {
	public static void main(String[]args) {
		String s1= "LAKSH";
		String alpha=s1.toLowerCase();
		System.out.println(alpha);
		
		
		String s2="akshay";
		char returning =s2.charAt(5);
		System.out.println(returning);
		
		
		String s3="abcd";
		String s4="efgh";
		String joint=s3.concat(s4);
		System.out.println(joint);
		
		
		String s5="akshay";
		String s6="akshy";
		boolean show=s5.equals(s6);
		System.out.println(show);
		
		
		String s7="nikhil";
		String s8="NIKHIL";
		boolean on=s7.equalsIgnoreCase(s8);
		System.out.println(on);
		
		
		String s9="chetan";
		String written =s9.substring(3);
		System.out.println(written);
		
		
		String s10="sahil";
		String check =s10.substring(2,3);
		System.out.println(check);
		
		String s11="avadhut";
		int sh=s11.length();
		System.out.println(sh);
		
		String ret=s11.replace('a','b');
		System.out.println("replacing value:" +ret);
		
		
		String s12= "    you      ";
		String yo =s12.trim();
		System.out.println(yo);
		
		
    	int num =s11.indexOf('h');
	    System.out.println("show me :"  + num);
	    
	    
	    int we =s11.lastIndexOf('u');
	    System.out.println("print statement:" + we);
	    
	    
	    String s13="ifyoucan";
	    boolean put=s13.contains("yot");
	    System.out.println(put);
	    
	    char[] with =s13.toCharArray();
	    for(int i=0;i<with.length;i++)
	    System.out.println(with[i]);
	    
	    
	    String s14="akshay2";
	   char check1 =s14.charAt(6);
	   System.out.println(Character.isDigit(check1));
	   
	   String s15="akshay  kukare";
	 String[] see=  s15.split("\\s");
	 for(String pa:see)
	 {
	 System.out.println(pa);
	 }  
	 
	 boolean check3=s13.isBlank();
	 System.out.println(check3);

	
	
	
		}
	

}
