class Hospital2
{
	String name;
	Specialization specialization;
    String[] equipments;
	int consultationFees;
	Founder founder;
	
	Hospital2(String name,Specialization specialization,String[] equipments,int consultationFees,Founder founder)
	{
		this.name=name;
		this.specialization=specialization;
		this.equipments=equipments;
		this.consultationFees=consultationFees;
		this.founder=founder;
	}
	
	void printDetails()
	{
		System.out.println(this.name);
		System.out.println(this.specialization.NUEROLOGY);
		for(int i=0;i<this.equipments.length;i++)
		{
		System.out.println(this.equipments[i]);
		}
		System.out.println(this.consultationFees);
		//System.out.println(this.founder);
		this.founder.printData();
	}
	
}