class SinivelCap
{
	public void SinivelTake()
	{
		System.out.println("콧물이 낫습니다.");
	}
}
class SneezeCap
{
	public void SneezeTake()
	{
		System.out.println("재채기가 멎습니다.");
	}	
}
class SnuffleCap
{
	public void SnuffleTake()
	{
		System.out.println("코가 뚫립니다.");
	}	
}
class coldPatient
{
	public void Sinivel (SinivelCap cap1)
	{
		cap1.SinivelTake();		
	}
	public void Sneeze (SneezeCap cap1)
	{
		cap1.SneezeTake();
	}
	public void Snuffle(SnuffleCap cap1)
	{
		cap1.SnuffleTake();
	}	
}
public class Encapsulation1
{
	public static void main (String[] args)
	{
		coldPatient patient = new coldPatient( );
		patient.Sinivel(new SinivelCap( ));
		patient.Sneeze(new SneezeCap( )); 
		patient.Snuffle(new SnuffleCap( ));
	}
}