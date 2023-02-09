import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		new Program5().palindrome();
	}

	public void palindrome() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = scanner.next();
		System.out.println("Enter how many times to be check");
		int size = scanner.nextInt();
		int[][] array = new int[size][2];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < 2; j++)
				array[i][j] = scanner.nextInt();
		}
		scanner.close();
		for (int i = 0; i < size; i++) {
			String dup = "";
			for (int j = array[i][0] - 1; j < array[i][1]; j++) {
				dup += string.charAt(j);
			}
			int count = 0;
			for (int j = 0; j < dup.length(); j++) {
				for (int k = j + 1; j < dup.length(); j++)
					if (string.charAt(j) == string.charAt(k))
						count++;
			}
			System.out.println(count);
		}
	}
}