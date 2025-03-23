class Doctor{
	public static void treatment(String patientname,int age)
	{
	System.out.println("PatientName:"+patientname+"Age"+age);
	Nurse.assist(patientname);
	}
	}