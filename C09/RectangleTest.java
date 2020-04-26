class Rectangle
{
	private int ulx,uly; //좌상단
	private int lrx,lry; //우하단

	public Rectangle(int Ulx,int Uly ,int Lrx,int Lry)
	{
		ulx = Ulx;
		uly = Uly;
		lrx = Lrx;
		lry = Lry;		
	}
	public boolean RectangleCompare()
	{
		if(ulx < 0 ||  ulx > 100)
		{
			System.out.println("좌상단 x좌표 다시 입력하시오.");
			return false;
		}
		else if(uly < 0 ||  uly > 100)
		{	
			System.out.println("좌상단 y좌표 다시 입력하시오.");
			return false;
		}
		else if(lrx < 0 ||  lrx > 100)
		{
			System.out.println("우하단 x좌표 다시 입력하시오.");
			return false;
		}
		else if(lry < 0 ||  lry > 100)
		{
			System.out.println("우하단 y좌표 다시 입력하시오.");
			return false;
		}
		else if(lrx - ulx > 0 ||  lry - uly> 0)
		{
			System.out.println("좌상단x,y좌표는 우하단 x,y좌표보다 작아야합니다");
			return false;
		}
		else 
		{
			return true;
		}
		
	}
	public void RectangleArea()
	{
		int xLen = lrx - ulx;
		int yLen = lry - uly;
		
		System.out.println("넓이 "+( xLen*yLen));		
	}
}
class RectangleTest
{
	public static void main(String[] args)
	{
		Rectangle pos1 = new Rectangle(10,10,0,2);
		if(pos1.RectangleCompare()==true)
		{
			pos1.RectangleArea();
		}	
	}
}