class Airport
	
{
static void ticketAvailable(int tickets)
{
if(tickets>2)
    {
	System.out.println("Not Availabale");
	return;
	}
if(tickets<2)
    {
	System.out.println("Availabale");
	return;
	}
if(tickets<0)
    {
	System.out.println("invalid");
	return;
    }
return;
}
static void passengerName(int id)
{
	
	String[] names={"Akash","Arun","Akshaya","Amith","Abhiman","Anoop","Abhi","Alish","Anand","Alok"};
	for(int i=0;i<names.length;i++)
		if(id>0)
	{
		System.out.println("passanger name :"+names[id]);
	    return;
	}
	    if(id<0)
	{
		System.out.println("invalid");
		return;
	}
	if(id==0)
	{
		System.out.println("NA");
		return;
	}
}

static void ticketPrice(String place)
{
if(place=="Tirupati")
{
	System.out.println(5000);
	return;
}
if(place=="chennai")
{
	System.out.println(3500);
	return;
}
if(place=="kolkata")
{
	System.out.println(8000);
	return;
}
if(place=="Goa")
{
	System.out.println(4000);
	return;
}
if(place=="Hubli")
{
	System.out.println(3500);
	return;
}
if(place=="Delhi")
{
	System.out.println(10000);
	return;
}
if(place=="Manali")
{
	System.out.println(8500);
	return;
}
if(place=="Agra")
{
	System.out.println(9500);
	return;
}
if(place=="Ranchi")
{
	System.out.println(7500);
	return;
}
if(place=="manglore")
{
	System.out.println(3500);
	return;
}

return;		
}
   

}
