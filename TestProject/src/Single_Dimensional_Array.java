import java.util.Arrays;

public class Single_Dimensional_Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
	    String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
	  //  String[] largerArray = ArrayUtils.insert(2, cars, "77");
	    boolean areEqual = Arrays.equals(cars, cars2);
	    System.out.println(areEqual);

	}
}
