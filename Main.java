// Christian Jackson
//import statements here for the scanner class

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("What is the temp in Celcius? ");
      double inputTemp = in.nextDouble();
      ConvertTemp ct = new ConvertTemp(inputTemp);
      System.out.printf("%.1f c = %.1f f%n", inputTemp, ct.getFTemp());
    }
}
