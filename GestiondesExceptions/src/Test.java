import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.print("Type a number : ");
		int x = sca.nextInt();
		System.out.print("Type a second number : ");
		int y = sca.nextInt();
		try {

			System.out.println(x / y);

		} catch (Exception e) {

			System.out.println("Une exception a �t� lev�e : division par zero !");

		}
	}
}
