class StaticMethod
{
    public static void main(String[] args)
	{
		String value=String.valueOf(5465654686546l);
		System.out.println(value);
		
		String value1=String.valueOf('M');
		System.out.println(value1);
		
		char[] data={'M','A','T'};
		String value2=String.copyValueOf(data);
		System.out.println(value2);
		
		String value3=String.valueOf(true);
		System.out.println(value3);
		
		String value4=String.valueOf(5.5d);
		System.out.println(value4);
		
		char[] data1={'J','A','N'};
		String value5=String.valueOf(data1,0,2);
		System.out.println(value5);
	}
}