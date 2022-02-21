package day11;

public class Static {
	static void logi(int v) throws Exception{
		System.out.println(10/v);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			logi(10);
			logi(5);
			logi(2);
			logi(0);
			
		}
		catch(Exception e)
		{
			System.out.println("here some exception handling is happenning Kindly see to it!");
			
		}

	}

}
