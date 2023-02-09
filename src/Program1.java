import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		new Program1().iceCreamParlor();
	}

	private void iceCreamParlor() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		System.out.println("Enter the elements");
		int[] array = new int[size];
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();
		System.out.println("Enter the cost");
		int cost = scanner.nextInt();
		scanner.close();

		List<List<Integer>> list = new ArrayList<>();
		List<List<Integer>> amount = new ArrayList<>();
		for (int i = 0; i < size; i++) {

			for (int j = i + 1; j < size; j++) {
				List<Integer> combination = new ArrayList<>();
				List<Integer> amountCombination = new ArrayList<>();
				if (array[i] + array[j] == cost) {
					combination.add(i + 1);
					combination.add(j + 1);
					amountCombination.add(array[i]);
					amountCombination.add(array[j]);
					list.add(combination);
					amount.add(amountCombination);
				}
			}
		}
		if (list.size() != 0) {
			System.out.println("The cost for the flavors");
			System.out.println(amount);
			System.out.println("Flavors indices are");
			System.out.println(list);
		} else
			System.out.println("There is no combination");
	}
}