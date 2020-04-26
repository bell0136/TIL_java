package orange.seller;
public class FruitSeller
{
	int money;
	int count;
	final int price;
	public FruitSeller(int Money,int Count,int Price) //생성자
	{
		money = Money;
		count = Count;
		price = Price;		
	}
	public int saleApple(int Money)
	{
		int num = money/price;
		count -= num;
		money += Money;	
		return num;
		
	}
	public void showSell()
	{
		System.out.println("남은 사과 :"+count);
		System.out.println("판매 수익 :"+money);		
	}
}
