import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		new Program2().sort();
	}

	public void sort() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of list");
		int size = scanner.nextInt();
		System.out.println("Enter the index and string");
		String string[] = new String[size];
		int array[] = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
			string[i] = scanner.next();
		}
		scanner.close();

		for (int i = 0; i < size / 2; i++)
			string[i] = "-";

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;

					String s = string[i];
					string[i] = string[j];
					string[j] = s;
				}
			}
		}
		for (int i = 0; i < array.length; i++)
			System.out.print(string[i] + " ");
	}
}