class AreaPostOffice{
	public static void deliver(String customername,String address)
	{
	System.out.println("AreaPostOffice:"+customername+"Deliver:"+address);
	SubRegionalPostOffice.deliver(customername,address);
	}
	}