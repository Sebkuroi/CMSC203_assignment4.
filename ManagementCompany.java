/*
 * Class: CMSC203 
 * Instructor:Grigoriy Grinberg
 * Description: (more or less building a property)
 * Due: 03/3/2023
 * Platform/compiler:eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Sebastian Black
*/

public class ManagementCompany 
{

	static final int MAX_PROPERTY = 5;
	static final int MGMT_WIDTH = 10;
	static final int MGMT_DEPTH = 10;
	
	
	private String name, taxID;
	private double MgmFeePer = 0;
	private Plot plot;
	private Property[] properties;
	private int TotalProperties;

	public ManagementCompany()
	{
		this.name = "";
		this.taxID = "";
		this.plot = new Plot();
		this.properties = new Property[MAX_PROPERTY];
	}

	public ManagementCompany(String name, String taxID, double mgmFee)
	{
		this.name = name;
		this.taxID = taxID;
		this.MgmFeePer = mgmFee;
		plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
	}

	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth)
	{
		this.name = name;
		this.taxID = taxID;
		this.MgmFeePer = mgmFee;
		plot = new Plot(x, y, width, depth);
		this.properties = new Property[MAX_PROPERTY];
	}

	public ManagementCompany(ManagementCompany otherCompany)
	{
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.MgmFeePer = otherCompany.MgmFeePer;
		this.plot = otherCompany.plot;
		this.properties = otherCompany.properties;
	}

	public int addProperty(String name, String city, double rent, String owner) 
	{
		properties[TotalProperties] = new Property(name,city,rent,owner);
		if (TotalProperties == 5) 
		{
			return -1;
		}
		if (properties[TotalProperties] == null)
		{
			return -2;
		}
		if (!plot.encompasses(properties[TotalProperties].getPlot())) 
		{
			return -3;
		}
		for (int propertynumber = 0; propertynumber < TotalProperties; propertynumber++) 
		{
			if (properties[propertynumber] != null) 
			{
			if (properties[propertynumber].getPlot().overlaps(properties[TotalProperties].getPlot())) 
			{
				return -4;
			}
			}
		}
		return TotalProperties++;
	}

	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) 
	{
		properties[TotalProperties] = new Property(name,city,rent,owner,x,y,width,depth);
		if (TotalProperties == 5) 
		{
			return -1;
		}
		if (properties[TotalProperties] == null)
		{
			return -2;
		}
		if (!plot.encompasses(properties[TotalProperties].getPlot())) 
		{
			return -3;
		}
		for (int propertynumber = 0; propertynumber < TotalProperties; propertynumber++) 
		{
			if (properties[propertynumber] != null) 
			{
			if (properties[propertynumber].getPlot().overlaps(properties[TotalProperties].getPlot())) 
			{
				return -4;
			}
			}
		}
		return TotalProperties++;
	}
	

	public int addProperty(Property property) 
	{
		properties[TotalProperties] = new Property(property);
		if (TotalProperties == 5) 
		{
			return -1;
		}
		if (properties[TotalProperties] == null)
		{
			return -2;
		}
		if (!plot.encompasses(properties[TotalProperties].getPlot())) 
		{
			return -3;
		}
		for (int propertynumber = 0; propertynumber < TotalProperties; propertynumber++) 
		{
			if (properties[propertynumber] != null) 
			{
			if (properties[propertynumber].getPlot().overlaps(properties[TotalProperties].getPlot())) 
			{
				return -4;
			}
			}
		}
		return TotalProperties++;

	}

	public void removeLastProperty()
	{
		properties[TotalProperties - 1] = null;
		TotalProperties--;
	}

	public boolean isPropertiesFull()
	{
		if (TotalProperties == 5)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	public int getPropertiesCount()
	{
		int numberofproperties = 0;
		for (int property = 0; property < MAX_PROPERTY; property++)
		{
			if (properties[property] == null)
			{
				break;
			}
			else
			{
				numberofproperties++;
			}
				
		}
		return numberofproperties;
	}

	public double getTotalRent()
	{
		double totalRent = 0;
		  for (int property=0;property<properties.length;property++) 
		{
			  if (properties[property] != null)
				{
				  totalRent += properties[property].getRentAmount();
				}
		}
		return totalRent;
	}

	public Property getHighestRentPropperty()
	{
		int BiggestRent = 0;
		for (int property=0;property<properties.length;property++) 
		{
			if (properties[property] == null)
			{
				break;
			}
			if (properties[BiggestRent].getRentAmount() < properties[property].getRentAmount()) 
			{
				BiggestRent = property;
			}
		}
		return properties[BiggestRent];
	}

	public boolean isMangementFeeValid()
	{
		return (MgmFeePer >= 0 && MgmFeePer <= 100);
	}

	public String getName()
	{
		return name;
	}

	public String getTaxID()
	{
		return taxID;
	}

	public Property[] getProperties()
	{
		return properties;
	}

	public int getMAX_PROPERTY() 
	{
		return MAX_PROPERTY;
	}

	public double getMgmFeePer()
	{
		return MgmFeePer;
	}

	public Plot getPlot()
	{
		return new Plot(plot);
	}

	public String toString()
	{
		String listofproperties = "";
		 for (int property=0;property<MAX_PROPERTY;property++) 
			{
				  if (properties[property] != null)
					
					  listofproperties += properties[property] + "\n";
		}
		return "These are the list of properties owned by " + name + ", taxID: " + taxID + "\n____________________________\n"
				+ listofproperties + "____________________________" + "\nThe total managementfee is: "
				+ (getTotalRent() * MgmFeePer / 100);
	}
}