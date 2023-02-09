import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		new Program9().patternPrinting();
	}

	void patternPrinting() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many rows to be print");
		int rows = scanner.nextInt();
		scanner.close();
		int[][] arr = new int[rows][rows];
		int l = rows;
		int a = 0;
		int b = l - 1;
		while (true) {
			for (int i = a; i <= b; i++) {
				arr[a][i] = 1;
				arr[i][a] = 1;
				arr[i][b] = 1;
				arr[b][i] = 1;
			}
			a = a + 2;
			b = b - 2;
			if (a >= b) {
				break;
			}
		}
		arr[a][b] = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}