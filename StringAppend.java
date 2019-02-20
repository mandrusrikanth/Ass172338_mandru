package lam.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringAppend {
	public static void main(String[] args) {
		Map<String,String> m=new HashMap<String,String>();
		m.put("srikanth","Guntur");
		m.put("kiran","hyd");
		m.put("durga","bangalore");
		m.put("saikumar","up");
		
		StringBuilder sb=new StringBuilder();
		Set<Map.Entry<String, String>> s=m.entrySet();
	
		
		for(Map.Entry<String,String> x:s) {
			sb=sb.append(x.getKey()+""+x.getValue());
		}
		
		System.out.println(sb);
		
		

	}

}
