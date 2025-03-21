class HospitalRunner{
	public static void main(String[] values)
	{
	String customername="Skanda ";
	String patientname="Bulbul ";
	int age=22 ;
	String mobile="8971733627 ";
	String email="bulbul6@gmail.com ";
	String sicknes="Cough ";
	System.out.println("CustomerName"+customername+"PatientName:"+patientname+"Age:"+age+" "+"Mobile:"+mobile+"Email:"+email+"sicknes:"+sicknes);
	Hospital.checkup(patientname,age,mobile,email,sicknes);
	}
	}