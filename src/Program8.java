import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		new Program8().sorting();
	}

	private final void sorting() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		int array[] = new int[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();
		scanner.close();
		for (int i = 1; i < array.length; i++) {
			int temp = array[i], j = i - 1;
			for (; j >= 0; j--) {
				if (array[j] > temp) {
					array[j + 1] = array[j];
				}
			}
			array[j + 1] = temp;
		}
		for (int i : array)
			System.out.print(i + " ");
	}
}