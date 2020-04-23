class Rectangle
{
	int ulx,uly;
	int lrx,lry;
	public void RectangleArea()
	{
		int xLen = ulx - lrx;
		int yLen = uly - lry;
		System.out.println("넓이 "+(xLen*yLen));
	}
}
class RectangleTest
{
	public static void main(String[] args)
	{
		Rectangle pos1 = new Rectangle();
		pos1.ulx = 12;
		pos1.uly = 12;
		pos1.lrx = 10;
		pos1.lry = 10;
		pos1.RectangleArea();	
	}
}