package ex7_1pro2;

class beads
{
	int beads;
	public beads(int Beads)
	{
		beads = Beads;
	}
	public void plus_beads(int Beads, beads child)
	{
		beads += Beads;
		System.out.println("************************");
		System.out.println("구슬"+Beads+"개를 받았습니다.");
		child.minus_beads(Beads);		
	}
	public void minus_beads(int Beads)
	{
		beads -= Beads;
		
		System.out.println("구슬"+Beads+"개를 줬습니다.");
			
	}
	public int showBeads()
	{	
		return beads;
	}
}
class ex7_1pro2
{
	public static void main(String[] args)
	{
		beads child1 = new beads(15);		
		beads child2 = new beads(13);
		System.out.println("게임 전 보유현황");
		System.out.println("child1's beads count is "+child1.showBeads());
		System.out.println("child2's beads count is "+child2.showBeads());	
		child1.plus_beads(2,child2);
		System.out.println("1차 게임 후 구슬 보유현황");
		System.out.println("child1's beads count is "+child1.showBeads());
		System.out.println("child2's beads count is "+child2.showBeads());		
		child2.plus_beads(5,child1);
		System.out.println("2차 게임 후 구슬 보유현황");
		System.out.println("child1's beads count is "+child1.showBeads());
		System.out.println("child2's beads count is "+child2.showBeads());	
		
	}	
}



