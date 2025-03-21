class Station{
	public static void send(String item)
	{
	System.out.println("running station "+item);
	DeliveryGuy.accept(item);
	}
	}