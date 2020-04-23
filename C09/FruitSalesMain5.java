class FruitSeller
{
	private int money;
	private int count;
	private final int price;
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
	private int money;
	private int count;
	private int price;
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
class FruitSalesMain5
{
	public static void main(String[] args)
	{
		FruitSeller seller1 = new FruitSeller(0,30,1500);	
		FruitBuyer buyer = new FruitBuyer(10000);

		buyer.buyApple(seller1, 4500);	
		System.out.println("과일 판매자1의 상황");
		seller1.showSell();
		System.out.println("과일 구매자1의 상황");
		buyer.showBuy();
	}
}