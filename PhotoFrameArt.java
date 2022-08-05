class PhotoFrameArt
{
	public static void main(String[] args)
	{
		PhotoFrame photoframe=new PhotoFrame(8,200,"rectangular",8);
		photoframe.setFrameMaterials(FrameMaterials.WOOD);
		FrameColour[] col={FrameColour.BLACK,FrameColour.BROWN,FrameColour.GRAY};
		photoframe.setFrameColour(col);
		photoframe.printData();
	}
}