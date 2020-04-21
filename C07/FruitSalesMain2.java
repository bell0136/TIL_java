class FruitSeller
{
	int money=10000;
	int count = 0;
	int price = 2000;
	public int SellRecord (int Money)
	{
		money += Money;
		count += Money/price;
		
		return count;
		
	}
	public void showRecord ()
	{
		System.out.println("수익 : "+money);
		System.out.println("개수 : "+count);
		System.out.println("가격 : "+price);

	}
	public void Sell (FruitSeller seller1, int Money, int Count, int Price)
	{
		money = Money;
		count = Count;
		price = Price;
	}
}
class FruitBuyer
{	
	int money = 20000;
	int count;
	int price = 2000;
	public void buyRecord (FruitSeller seller, int Money)
	{
		count = seller.SellRecord(Money);
		money += Money;		
		price = Money/count;
	}
	public void showRecord ()
	{
		System.out.println("수익 : "+money);
		System.out.println("개수 : "+count);
		System.out.println("가격 : "+price);

	}
}
class FruitStore2
{ 
	public static void main(String[] args)
	{
		FruitSeller seller1 = new FruitSeller();
		seller1.Sell(seller1,2000,1,2000);
		FruitSeller seller2 = new FruitSeller();
		seller2.Sell(seller2,6000,3,2000);		
		FruitBuyer buyer1 = new FruitBuyer();	
		buyer1.buyRecord(seller1,2000);
		buyer1.buyRecord(seller2,6000);

		System.out.println("판매자수 상황1");
		buyer1.showRecord();
		System.out.println("구매자수 상황1");
		seller1.showRecord();
		System.out.println("구매자수 상황2");
		seller2.showRecord();
			
	}
}