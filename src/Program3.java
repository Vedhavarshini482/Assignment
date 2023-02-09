import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		new Program3().expenditure();
	}

	private void expenditure() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scanner.nextInt();
		System.out.println("Enter the elements");
		int array[] = new int[size];
		for (int i = 0; i < size; i++)
			array[i] = scanner.nextInt();
		System.out.println("Enter the trailing days");
		int days = scanner.nextInt(), count = 0;
		scanner.close();
		float sum = 0;
		for (int i = 0; i < days; i++)
			sum += array[i];
		sum = (sum / days) * 2;
		for (int i = 0; i < size; i++)
			if (array[i] >= sum)
				count++;
		System.out.println(count);
	}
}