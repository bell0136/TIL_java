class FruitSeller
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
class FruitBuyer
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
class FruitSalesMain4
{
	public static void main(String[] args)
	{
		FruitSeller seller1 = new FruitSeller(0,30,1500);
	
		FruitBuyer buyer = new FruitBuyer(10000);

		seller1.money += 500;
		buyer.money -= 500;
		seller1.count -= 20;
		buyer.count += 20;
	
		System.out.println("과일 판매자1의 상황");
		seller1.showSell();

		System.out.println("과일 구매자1의 상황");
		buyer.showBuy();
	}
}