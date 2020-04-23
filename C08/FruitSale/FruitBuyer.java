package orange.buyer;
import orange.seller.FruitSeller;
public class FruitBuyer
{
	int money;
	int count;
	int price;
	public FruitBuyer(int Money)
	{
		money = Money;
		count = 0;	
	}
	public void buyApple(FruitSeller seller,int money)
	{
		count += seller.saleApple(money);
		money -= money;
	}
	public void showBuy()
	{
		System.out.println("현재 잔액 :"+money);
		System.out.println("사과 개수 :"+count);
	}
}	