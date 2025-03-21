class Shop{
	public static void cell(String vegetable,int quantity)
	{
	System.out.println("Shop:"+vegetable+"cell:"+quantity);
	Agent.purchase(vegetable,quantity);
	}
	}