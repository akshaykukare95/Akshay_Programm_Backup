package javapracticeprogramm;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharecter {
public static void main(String[] args) {
	String st="ajhddhhdhgdwdgdwhuhjzzzyswtdqudidnjbhsgsdgsdddkjdhshqsqkdkfjds11ddhdwhdwwd3w3wdwdwhwdwhjwdwdhwwgyww";
	char ar[]= st.toCharArray();
	
	HashMap<Character,Integer> smap= new HashMap<Character,Integer>();
	for(char ch1:ar)
		if(smap.containsKey(ch1))
			smap.put(ch1, smap.get(ch1)+1);
			else
				smap.put(ch1,1);
				
			Set<Character>	keys=smap.keySet();
			for(char key:keys)
				if(smap.get(key)>1)
					System.out.println(key +" : " + smap.get(key));
				
	
}
}
