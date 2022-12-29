import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


    ArrayList<String> phoneNumbers = new ArrayList<>();

  
    while (true) {
      System.out.println("Phonebook menu:");
      System.out.println("1. Add a phone number");
      System.out.println("2. Edit a phone number");
      System.out.println("3. Delete a phone number");
      System.out.println("4. Search for a phone number");
      System.out.println("5. Display all phone numbers");
      System.out.println("0. Exit");
      System.out.print("Enter a choice: ");
      int choice = scanner.nextInt();

     
      switch (choice) {
        case 1:
       
          System.out.print("Enter a phone number: ");
          String phoneNumber = scanner.next();
          phoneNumbers.add(phoneNumber);
          System.out.println("Phone number added.");
          break;
        case 2:
    
          System.out.print("Enter the index of the phone number to edit: ");
          int index = scanner.nextInt();
          System.out.print("Enter the new phone number: ");
          phoneNumber = scanner.next();
          phoneNumbers.set(index, phoneNumber);
          System.out.println("Phone number edited.");
          break;
        case 3:
     
          System.out.print("Enter the index of the phone number to delete: ");
          index = scanner.nextInt();
          phoneNumbers.remove(index);
          System.out.println("Phone number deleted.");
          break;
        case 4:
     
          System.out.print("Enter a phone number to search for: ");
          phoneNumber = scanner.next();
          if (phoneNumbers.contains(phoneNumber)) {
            System.out.println("Phone number found.");
          } else {
            System.out.println("Phone number not found.");
          }
          break;
        case 5:
     
          System.out.println("Phone numbers: " + phoneNumbers);
          break;
        case 0:
          
          System.out.println("Exiting phonebook...");
          return;
        default:
          System.out.println("Invalid choice. Please try again.");
          break;
      }
    }
  }
}
