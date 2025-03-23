class Hospital{
	public static void checkup(String patientname,int age,String mobile,String email,String sicknes)
	{
	System.out.println("PatientName:"+patientname+"Age:"+age+" "+"Mobile:"+mobile+"Email:"+email+"sicknes:"+sicknes);
	Doctor.treatment(patientname,age);
	}
	}