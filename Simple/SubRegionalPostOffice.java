class SubRegionalPostOffice{
	public static void deliver(String customername,String address)
	{
	System.out.println("SubRegionalPostOffice:"+customername+"Deliver:"+address);
	RegionalPostOffice.deliver(customername,address);
	}
	}