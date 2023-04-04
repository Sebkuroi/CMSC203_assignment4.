public class Plot 
{
	private int x;
	private int y;
	private int width;
	private int depth;

	public Plot()
	{
		x = 0;
		y = 0;
		width = 1;
		depth = 1;
	}

	public Plot(int x, int y, int width, int depth)
	{
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}

	public Plot(Plot otherPlot)
	{
		this.x = otherPlot.x;
		this.y = otherPlot.y;
		this.width = otherPlot.width;
		this.depth = otherPlot.depth;
	}

	public boolean overlaps(Plot plot)
	{ 
	
	    int Xtopright = x + width; 
	    int Ytopright = y + depth;
	    
	    int Xbotleft = x;
	    int Ybotleft= y;
	    
	    int Xplottopright = plot.getX() + plot.getWidth(); 
	    int Yplottopright = plot.getY() + plot.getDepth();
	    
	    int Xplotbotleft = plot.getX();
	    int Yplotbotleft = plot.getY();

	        if((Yplotbotleft < Ytopright)&&(Xbotleft < Xplottopright) && (Xplotbotleft < Xtopright) &&   (Ybotleft < Yplottopright))
	        	return true;
	        else 
	        	return false;
	}

	public boolean encompasses(Plot plot)
	{ 
		boolean X = plot.x >= x;
	    boolean Y = plot.y >= y;
	    boolean Width = plot.x + plot.width <= x + width;
	    boolean Depth = plot.y + plot.depth <= y + depth;
	    
	    return X && Y && Width && Depth;
	}

	public void setX(int x) 
	{
		this.x = x;
	}

	public void setY(int y) 
	{
		this.y = y;
	}

	public void setWidth(int width) 
	{
		this.width = width;
	}

	public void setDepth(int depth) 
	{
		this.depth = depth;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}

	public int getWidth()
	{
		return width;
	}

	public int getDepth()
	{
		return depth;
	}

	public String toString()
	{
		return x + "," + y + "," + width + "," + depth;
	}

}