package lam.com;

public class TestOperations {
	public static void main(String[] args) {
		Operations addition=(a,b) -> (a+b);
		System.out.println("Addition is "+addition.operations(5,6));
		Operations subtract=(a,b) -> (a-b);
		System.out.println("subtract is "+subtract.operations(10,6));
		Operations multiply=(a,b) -> (a*b);
		System.out.println("multiplyis "+multiply.operations(5,5));
		Operations divide=(a,b) -> (a/b);
		System.out.println("divide is "+divide.operations(10,2));
	}

}
