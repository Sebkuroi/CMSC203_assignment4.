public class Property 
{
	private String propertyName;
	private String city;
	private double rentAmount;
	private String owner;
	private Plot plot;

	public Property()
	{
		propertyName = "";
		city = "";
		owner = "";
		rentAmount = 0;
		plot = new Plot();
	}

	public Property(String propertyName, String city, double rentAmount, String owner)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		plot = new Plot();
	}

	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth)
	{
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x, y, width, depth);
	}

	public Property(Property otherProperty)
	{
		this.propertyName = new String(otherProperty.propertyName);
		this.city = new String (otherProperty.city);
		this.rentAmount = otherProperty.rentAmount;
		this.owner = new String (otherProperty.owner);
		this.plot = new Plot(otherProperty.plot);
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public void setOwner(String owner)
	{
		this.owner = owner;
	}

	public void setPropertyName(String propertyName)
	{
		this.propertyName = propertyName;
	}

	public void setRentAmount(double rentAmount)
	{
		this.rentAmount = rentAmount;
	}

	public String getCity()
	{
		return city;
	}

	public String getOwner()
	{
		return owner;
	}

	public String getPropertyName()
	{
		return propertyName;
	}

	public double getRentAmount()
	{
		return rentAmount;
	}

	public Plot getPlot()
	{
		return plot;
	}

	public String toString()
	{
		return (propertyName + "," + city + "," + owner + "," + rentAmount);
	}
}