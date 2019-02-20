package lam.com;

import java.util.ArrayList;

public class UpperCase {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("srikanth");
		a.add("pavan");
		a.add("venkatesh");
		a.add("satish");
		System.out.println(" list before is:");
		a.forEach(System.out::println);
		System.out.println("..................................................");
		a.replaceAll(e -> e.toUpperCase());
		System.out.println("list after replacing is : ");
		a.forEach(System.out::println);
		

		}
}
