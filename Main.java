public class Main {

	public static void main(String[] args) {
		// Question 1
		System.out.println("Hello, I am Ian");
		// Question 2
		String module = "CSC1009";
		switch (module) {
		case "CSC1009":
			System.out.println("Object Oriented Programming");
			break;
		case "CSC1006":
			System.out.println("Mathematics 2");
			break;
		case "CSC1007":
			System.out.println("Operating Systems");
			break;
		case "CSC1008":
			System.out.println("Data Structure and Algorithms");
			break;
		default:
			System.out.println("Unknown");
			break;
		}
		System.out.println("After switch");
		//Question 3
		for (int x = 102; x >= 66; x--)
		{
			if ( x % 2 != 0) {
				System.out.println("Odd numbers:" + x);
			}
		}
	}
}