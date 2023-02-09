import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		new Program10().divisibility();
	}

	public void divisibility() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		System.out.println("Enter the elements");
		int array[] = new int[size];
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();
		System.out.println("Enter the divisible number");
		int number = scanner.nextInt();
		scanner.close();

		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			List<Integer> combination = new ArrayList<Integer>();
			for (int j = i + 1; j < size; j++) {
				if ((array[i] + array[j]) % number == 0) {
					combination.add(array[i]);
					combination.add(array[j]);
					list.add(combination);
				}
			}
		}
		System.out.println(list);
	}
}