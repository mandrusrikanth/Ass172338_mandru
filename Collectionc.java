package lam.com;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class Collectionc {
	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("srikanth");
		a.add("mandru");
		a.add("venkatesh");
		a.add("sai");
		a.removeIf(e->e.length()%2!=0);
		System.out.println(a);
	}

}
