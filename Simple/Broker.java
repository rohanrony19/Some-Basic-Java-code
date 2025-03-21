class Broker{
	public static void brokerage(String vegetable,int quantity)
	{
	System.out.println("Brokerage:"+vegetable+"Brokers:"+quantity);
	Farmer.farm(vegetable,quantity);
	}
	}