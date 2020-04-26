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
		beads child2 = new beads(2);
		System.out.println("게임전");
		System.out.println("child1's beads count is "+child1.showBeads());
		System.out.println("child2's beads count is "+child2.showBeads());	
		child1.plus_beads(2,child2);
		System.out.println("게임후");
		System.out.println("child1's beads count is "+child1.showBeads());
		System.out.println("child2's beads count is "+child2.showBeads());		
	}	
}