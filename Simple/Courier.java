class Courier{
	public static void pickup(String item)
	{
	System.out.println("Running courier "+item);
	Station.send(item);
	}
	}