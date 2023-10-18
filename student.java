class Student10
{
	String name;
	Student10()
	{
	//name = "unknown";
	}
	Student10(String x)
	{
	name = x;
	}

	public String getname(){return name;}
	
	public static void main(String[] args)
	{
	 Student10 s1 = new Student10();
	 Student10 s2 = new Student10("Amrit");

	 System.out.println(s1.getname());
	 System.out.println(s2.getname());
	}
}