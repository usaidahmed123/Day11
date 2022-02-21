package day11;

public class ThrowException {
	void check(int salary) {
		try
		{
			if(salary>10)
			{
				throw new ArithmeticException("Not eligible");  
			}
			else
			{
				System.out.println("Eligible");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Sorrrryy");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowException N = new ThrowException();
		N.check(12);
		System.out.println("Extra");

	}

}
