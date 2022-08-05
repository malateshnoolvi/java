class PhotoFrame
{
	int size;
	int price;
	String shape;
	FrameColour[] colour;
	FrameMaterials materials;
	double warranty;
	
	PhotoFrame(int size,int price,String shape,double warranty)
	{
		this.size=size;
		this.price=price;
		this.shape=shape;
		this.warranty=warranty;	
	}
	
	void setFrameColour(FrameColour[] colour)
	{
		this.colour=colour;
	}
	void setFrameMaterials(FrameMaterials materials)
	{
		this.materials=materials;
	}
	void printData()
	{
		System.out.println(this.size);
		System.out.println(this.price);
		System.out.println(this.shape);
		System.out.println(this.warranty);
		for(int i=0;i<this.colour.length;i++)
		{
		System.out.println(this.colour[i]);
		}
		System.out.println(this.materials);
	}
}