class HospitalArt2
{
	public static void main(String[] args)
	{
		String[] equip={"forceps","scissors","curette","needle holder","retractor"};
		Founder founder=new Founder("Veerendra Hegade","Darmastala",Profession.SOCIALWORKER,1996,true,25200);
		Hospital2 hospital=new Hospital2("SDM Hospital",Specialization.NUEROLOGY,equip,25000,founder);
		hospital.printDetails();
	}
}