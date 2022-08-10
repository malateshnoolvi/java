class GymArt1
{
	public static void main(String[] args)
	{
		String[] items={"kettleball","weightlift","plates","bench press"};
		Gym1 gym=new Gym1("Lucky",1200d,items);
		Trainer trainer=new Trainer("Dev",8073450154l,5,Gender.MALE,32);
		gym.setTrainer(trainer);
		gym.details();
	}
}