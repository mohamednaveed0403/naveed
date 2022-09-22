package naveed;

public class SwapTwoNumbersExercise {

	public static void main(String[] args) {
    
		float first = 2.50f, second = 4.50f;
		
		System.out.println("--BEFORE SWAP--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
		
		float temporary = first;
		first = second;
		second = temporary;
		
		System.out.println("--AFTER SWAP--");
		System.out.println("First number " + first);
		System.out.println("Second number "+ second);
	}

}
