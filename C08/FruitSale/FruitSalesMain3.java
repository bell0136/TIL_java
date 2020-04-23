import orange.seller.FruitSeller;
import orange.buyer.FruitBuyer;

public class FruitSalesMain3
{
	public static void main(String[] args)
	{
		FruitSeller seller1 = new FruitSeller(0,30,1500);
		FruitSeller seller2 = new FruitSeller(0,20,1000);
	
		FruitBuyer buyer = new FruitBuyer(10000);
	
		buyer.buyApple(seller1, 4500);
		buyer.buyApple(seller2, 2000);
		
		System.out.println("과일 판매자1의 상황");
		seller1.showSell();
		System.out.println("과일 판매자2의 상황");
		seller2.showSell();
		System.out.println("과일 구매자1의 상황");
		buyer.showBuy();
	}
}