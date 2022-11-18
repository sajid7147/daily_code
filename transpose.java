import java.util.*;

public class transpose {
  public static void main(String args[]) {
    int m, n;
    int i, j;

    Scanner ob = new Scanner(System.in);
    System.out.println("Enter the number of rows :");
    m = ob.nextInt();
    System.out.println("Enter the number of coloumns :");
    n = ob.nextInt();

    int mat[][] = new int[m][n];

    System.out.println("Enter the elements :");
    for (i = 0; i < m; i++)
      for (j = 0; j < n; j++) {
        mat[i][j] = ob.nextInt();
      }

    System.out.println("The matrix is ");
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        System.out.print(mat[i][j] + "  ");
      }
      System.out.println();
    }

    int transp[][] = new int[m][n];
    for (i = 0; i < m; i++)
      for (j = 0; j < n; j++)
        transp[i][j] = mat[j][i];

    System.out.println("The transpose matrix is :");
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        System.out.print(transp[i][j] + "  ");
      }
      System.out.println();
    }

  }
}