package mavenproject;

public class PrimeNumber {

	  public static void main(String[] args) {

	    int Input = 33;
	    boolean flag = false;
	    for (int i = 2; i <= Input / 2; ++i) {
	      // condition for nonprime number
	      if (Input % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (!flag)
	      System.out.println(Input + " is a prime number.");
	    else
	      System.out.println(Input + " is not a prime number.");
	  }
	}
