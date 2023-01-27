package lab;

import java.util.Scanner;

public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String words;
    System.out.println("Enter something:");
    words = input.nextLine();
    System.out.println(words);   
  }
}