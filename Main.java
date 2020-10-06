import java.util.Scanner;

/**
 * this program will tell you if the number inputed is a prime number
 *
 * @author isaac
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);
    System.out.println("What number do you want to check?");
    int number = input.nextInt();
    int counter =2;
    while(counter < number){
      if(number % counter == 0){
        System.out.println(number + " is not a prime number.");

      }
      counter = counter + 1;
    }
    if(number == counter){
      System.out.println(number + " is not a prime number.");
    }
    
  }
}
