class Agent{
	public static void purchase(String vegetable,int quantity)
	{
	System.out.println("purchase:"+vegetable+"Agents:"+quantity);
	Broker.brokerage(vegetable,quantity);
	}
	}