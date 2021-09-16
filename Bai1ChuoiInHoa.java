import java.util.Scanner;

/**
 * Bai1ChuoiInHoa
 */
public class Bai1ChuoiInHoa {

    public static void main(String[] args) {


        System.out.println("Input character: "); 
		Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        
        System.out.println("OUTPUT toUpperCase: " + name.toUpperCase());
		scanner.close();
	}
        
}