class SinivelCap
{
	public void take()
	{
		System.out.println("콧물이 싹 낫습니다.");
	}
}
class SneezeCap
{
	public void take()
	{
		System.out.println("재채기가 싹 멎습니다.");
	}

}
class SnuffleCap
{
	public void take()
	{
		System.out.println("코가 뻥 뚫립니다.");
	}

}
class DiseaseTake
{
	SinivelCap sin;
	SneezeCap sne;
	SnuffleCap snu;
	public DiseaseTake()
	{
		sin = new SinivelCap();
		sne = new SneezeCap();
		snu = new SnuffleCap();	
	} 
	public void Take ()
	{	
		sin.take();
		sne.take();
		snu.take();
	}
}
class Cold 
{
	public void takeSolution(DiseaseTake cap)
	{
		cap.Take();	
	}
}
class Encapsulation2
{
	public static void main (String[] args)
	{
		Cold patient = new Cold(); 
		patient.takeSolution(new DiseaseTake());
			
	}
} 