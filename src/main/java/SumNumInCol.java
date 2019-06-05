import java.util.Scanner;

public class SumNumInCol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so hang cua ma tran: ");
        int rows = scanner.nextInt();
        System.out.println("Nhap vao so cot cua ma tran: ");
        int cols = scanner.nextInt();

        float[][] matrix = new float[rows][cols];
        float sumCols = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Nhap vao gia tri cua ma tran tai vi tri [" + i + "][" + j + "]");
                matrix[i][j] = scanner.nextFloat();
            }
        }

        System.out.println("Nhap vao cot muon tinh tong");
        int colIndex = scanner.nextInt();

        for (int k = 0; k < cols; k++) {
            sumCols += matrix[k][colIndex];
        }

        System.out.println("Tong gia tri cua cot " + colIndex + " la: " + sumCols);
    }
}
