package lam.com;

public class OrderPrice {
	public static void main(String[] args) {
		Order ord=(price) ->{
		if(price>10000) {
				System.out.println("ACCEPTED");
		}
			else
			{
				System.out.println("Completed");
			}
		};
		ord.order(12000);
	}


}
