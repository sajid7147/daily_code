import java.util.*;

public class pattern {
  public static void main(String[] args) {
    int rows;
    int i, j;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    rows = s.nextInt();

    for (i = rows; i > 0; i--) {
      for (j = 0; j < i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

  }

}
