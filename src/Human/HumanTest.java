package Human;
import java.util.Scanner;
public class HumanTest {

	public static void main (String[]args) { 

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("What is the person's first name, last name, middle initial, career, and years old in order?");
		Human Human=new Human(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextInt() );
		
		System.out.println(Human.FirstName);
		System.out.println(Human.LastName);
		System.out.println(Human.MiddleI);
		System.out.println(Human.Career);
		System.out.println(Human.years);
			
}
}