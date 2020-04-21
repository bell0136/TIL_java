class FruitSeller
{
	int s_money;
	int s_count;
	public int Sell (int Money)
	{
		s_count += 1;
		s_money += Money;	
		return s_money;
	}
	public void showSell ()
	{
		System.out.println("수익 : "+s_money);
		System.out.println("팔린 사과 : "+s_count);
	}
}
class FruitBuyer
{
	int b_money = 100000;
	int b_count = 0;
	public void Buy (FruitSeller seller , int Money)
	{
		b_money -= Money;
		b_count += 1;	
		seller.Sell(Money);
	}
	public void showBuy ()
	{
		System.out.println("잔액 : "+b_money);
		System.out.println("구입한 사과 개수 : "+b_count);
	}
}
class FruitStore
{
	public static void main(String[] args)	//사과 한 개 값 2000원
	{
		FruitSeller seller1 = new FruitSeller();
		FruitBuyer buyer1 = new FruitBuyer();		
		buyer1.Buy(seller1,2000);
		System.out.println("**판매자의 수익결과**");
		seller1.showSell();
		System.out.println("**소비자의 가계부**");		
		buyer1.showBuy();
	}
	
}