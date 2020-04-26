class Employer
{
	private int erMoney;
	public Employer (int money)
	{
		erMoney = money;
	}
	public void erPay (Employee Ee , int money)
	{
		if(erMoney<money)
		{	
			return ;
		}
		Ee.eePay(money);
		erMoney -= money;
	}
	public void showErPay ()
	{
		System.out.println("employee's pay is "+erMoney);
	}
	public static void main(String[] args)
	{
		Employer er1 = new Employer(100000);
		Employee ee1 = new Employee(2000);
		er1.erPay(ee1,4500);
		er1.showErPay();
		ee1.showEePay();
		
	}
}
class Employee
{
	private int eeMoney;
	public Employee (int money)
	{
		eeMoney = money;
	}
	public void eePay (int money)
	{
		eeMoney += money;
	}
	public void showEePay()
	{
		System.out.println("employee's pay is "+eeMoney);
	}

}
