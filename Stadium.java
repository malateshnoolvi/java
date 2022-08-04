class Stadium
{
	static void playStadium()
	{
		System.out.println("stadium info");
	}
	static void playStadium(String stadiumName)
	{
		System.out.println("stadium name :"+stadiumName);
	}
	static void playStadium(int seats)
	{
		System.out.println("number of seats :"+seats);
	}
	static void playStadium(boolean cricket)
	{
		System.out.println("its a cricket stadium :"+cricket);
	}
	static void playStadium(double workers,char seatname)
	{
		System.out.println("number of workers :"+workers);
		System.out.println("seat name start with :"+seatname);
	}
	static void playStadium(long audience)
	{
		System.out.println("number of audience :"+audience);
	}
}