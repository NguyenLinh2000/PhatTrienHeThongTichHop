import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("INPUT ARRAY CHARACTER: ");
		String name = scanner.nextLine();

		System.out.println("OUTPUT UPPERCASE: " + name.toUpperCase());
	}
}
