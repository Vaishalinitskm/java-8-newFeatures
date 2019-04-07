
public class TestUnboxing_Boxing {
	
	
	public static void main(String args[]) {
		
		
		IntA a = new IntA();
		
		int ab1 = 2;
//		int ab2 = 3;
		
//		Integer ab1 = 2;
		Integer ab2 = 3;
		a.testA(ab1, ab2);// Automatic autoboxing 
		//and mapping to appropriate
	}

}


class IntA{
	
	public void testA(Integer a, Integer b) {
		System.out.println("test A with... Integer");
	}
	
//	public void testA(int a, int b) {
//		System.out.println("test A with... int");
//	}
}