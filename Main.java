import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Contact> contacts = new ArrayList<>();

    static {
        String phone1 = "0985161234";
        String phone2 = "0985161234";
        String phone3 = "0985161234";
        contacts.add(new Contact("An", "nhan vien", phone1, "Male", "Hanoi", "quang@gmail.com"));
        contacts.add(new Contact("Ba", "quan ly", phone2, "Male", "Ha Nam", "quang@gmail.com"));
        contacts.add(new Contact("Minh", "nhan vien", phone3, "Male", "Hai Phong", "quang@gmail.com"));
    }

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ContactHandler handler = new ContactHandler(contacts);
      
        int option = 0;
        while (option!=6)
        {
            showOptionMenu();
            try{
                option = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException ex){
                System.out.println("Please enter a number");
                continue;
            }

            switch (option)
            {
                case 1:
                    handler.getAllContact();
                    break;
                case 2:
                    if(handler.addNewContact()){
                        System.out.println("Add new success");
                    }else{
                        System.out.println("Fail to add new");
                    }
                    break;
                case 3:
                    if(handler.updateContact()){
                        System.out.println("Update success");
                    }else{
                        System.out.println("Fail to update");
                    }
                    break;
                case 4:
                    handler.deleteContact();
                    break;
                case 5:
                    handler.searchContact();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Please enter a number between 1 - 6");
                    break;
            }
        }
        System.out.println("\n\n--------End Code--------");
    }

    private static void showOptionMenu() {
        System.out.println("\n\n--Contacts management--");
        System.out.println("1. List");
        System.out.println("2. Add new");
        System.out.println("3. Sync");
        System.out.println("4. Delete");
        System.out.println("5. Search");
        System.out.println("6. Exit");
        System.out.print("Choose option: ");
    }

}