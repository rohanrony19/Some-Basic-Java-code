class RegionalPostOffice{
	public static void deliver(String customername,String address)
	{
	System.out.println("RegionalPostOffice:"+customername+"Deliver:"+address);
	PostHeadMaster.Head(customername,address);
	}
	}