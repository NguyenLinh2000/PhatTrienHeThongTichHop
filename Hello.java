import java.util.Scanner;

import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Hello {
    public static void main(String[] args) {

		System.out.println("Hello Week 2");

		Scanner scanner = new Scanner(System.in);

		System.out.println("INPUT ARRAY CHARACTER: ");
		String name = scanner.nextLine();

		System.out.println("OUTPUT UPPERCASE: " + name.toUpperCase());

		
	}
}
