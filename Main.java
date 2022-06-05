import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("\nEnter the number: ");
    int num1 = scan.nextInt();
    System.out.println("Enter the number: ");
    int num2 = scan.nextInt();
    System.out.println("Enter the action: ");
    String act = scan.nextLine();
    act = scan.nextLine();

    int res;
    switch(act) {
    case "+":
    res = num1 + num2;
    System.out.println("\nResult: " + res);
    break;
    case "-":
    res = num1 - num2;
    System.out.println("\nResult: " + res);
    break;
    case "*":
    res = num1 * num2;
    System.out.println("\nResult: " + res);
    break;
    case "/":
    if(num2 == 0)
    System.out.println("\nError!");
    else {
    res = num1 / num2;
    System.out.println("\nResult: " + res);
        }
              }

    }

}