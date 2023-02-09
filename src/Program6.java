import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		new Program6().rotateMatrix();
	}

	public void rotateMatrix() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of matrix");
		int size = scanner.nextInt();
		System.out.println("Enter the elements");
		int array[][] = new int[size][size];
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				array[i][j] = scanner.nextInt();
		scanner.close();
		
		for (int m = 0; m < 3; m++) {
			int dup[][] = new int[array.length][array.length];
			for (int i = array.length - 1, k = 0; i >= 0; i--, k++) {
				for (int j = 0; j < array.length; j++) {
					dup[j][i] = array[k][j];
				}
			}
			array = dup.clone();
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++)
				System.out.print(array[i][j] + " ");
			System.out.println();
		}
	}
}