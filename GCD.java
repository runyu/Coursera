import java.util.*;

public class GCD {
  private static int gcdEuclid(int a, int b) {
    if(a % b ==0){
    	return b;
    }else{
    	return gcdEuclid(b, a % b);
	}
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcdEuclid(a, b));
  }
}
