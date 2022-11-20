import java.util.*;

public class reverse {
  public static void main(String args[]) {
    int len;
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter a string");
    String str = ob.nextLine();
    String rev = " ";
    len = str.length();
    for (int i = len - 1; i >= 0; i--) {
      rev = rev + str.charAt(i);
    }

    System.out.println("The reversed string is " + rev);

  }

}
