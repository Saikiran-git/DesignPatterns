
public class ShapeMaker {

	private Shape circle;
	private Shape rectangle;
	private Shape square;
	private Shape triangle;
	
	public ShapeMaker() {
		super();
	}
	
	public void drawCircle()
	{
		circle=new Circle();
		circle.draw();
	}
	
	public void drawRectangle()
	{
		rectangle=new Rectangle();
		rectangle.draw();
	}
	
	public void drawSquare()
	{
		square=new Square();
		square.draw();
	}
	
	public void drawTriangle()
	{
		triangle=new Triangle();
		triangle.draw();
	}
}
