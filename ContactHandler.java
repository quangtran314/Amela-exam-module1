import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactHandler {
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_PHONE_NUMBER_REGEX = Pattern.compile("^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$", Pattern.CASE_INSENSITIVE);
    
    
    private List<Contact> contacts;
    private Scanner scanner;

    public ContactHandler(List<Contact> contacts){
        this.contacts = contacts;
        scanner = new Scanner(System.in);
    }

    public void getAllContact(){
        System.out.println("List contacts: ");
        contacts.forEach(item-> System.out.println(item.toString()));
    }

    public boolean addNewContact(){
        System.out.println("Enter new contact infomation");

        System.out.print("Phone number: ");
        String phoneNumber =  scanner.nextLine();
        Matcher phoneNumberMatcher = VALID_EMAIL_ADDRESS_REGEX.matcher(phoneNumber);

        System.out.print("Group: ");
        String group =  scanner.nextLine();

        System.out.print("Full name: ");
        String name =  scanner.nextLine();

        System.out.print("Gender: ");
        String gender =  scanner.nextLine();

        System.out.print("Address: ");
        String address =  scanner.nextLine();

        System.out.print("Email: ");
        String email =  scanner.nextLine();
        Matcher emailMatcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
        
        if(phoneNumberMatcher.find() || emailMatcher.find()){
            contacts.add(new Contact(phoneNumber, group, name, gender, address, email));
            return true;
        } else {
            System.out.println("Invalid input");
            return false;
        }
    }

    public boolean updateContact() {
        int vtri = -9;
        while (vtri==-9)
        {
            System.out.print("Enter contact need to edit: ");
            String name =  scanner.nextLine();
            for (int i=0 ; i< contacts.size(); i++)
            {
                if (contacts.get(i).getName().equalsIgnoreCase(name))
                    vtri = i;
            }
            if (vtri==-9)
                System.out.println("Contact not exist, check again");
        }

        System.out.print("Enter contact need to edit");

        System.out.print("Phone number: ");
        String phoneNumber =  scanner.nextLine();
        Matcher phoneNumberMatcher = VALID_EMAIL_ADDRESS_REGEX.matcher(phoneNumber);

        System.out.print("Group: ");
        String group =  scanner.nextLine();

        System.out.print("Full name: ");
        String name =  scanner.nextLine();

        System.out.print("Gender: ");
        String gender =  scanner.nextLine();

        System.out.print("Address: ");
        String address =  scanner.nextLine();

        System.out.print("Email: ");
        String email =  scanner.nextLine();
        Matcher emailMatcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);

        if(phoneNumberMatcher.find() || emailMatcher.find()){
            Contact contact = new Contact(phoneNumber, group, name, gender, address, email);
            contacts.set(vtri, contact);
            System.out.println("Edit success");
            return true;
        } else {
            System.out.println("Invalid input");
            return false;
        }
    }

    public void deleteContact() {
        boolean check = false;
        while (!check)
        {
            System.out.print("Enter contact name need to delete: ");
            String name =  scanner.nextLine();
            for (Contact p : contacts)
                if (p.getName().equalsIgnoreCase(name))
                    check = true;
            System.out.println("Contact not exist");
        }
        System.out.println("Delete success");
    }

    public void searchContact() {

            System.out.println("Enter contact need to find: ");
            String name =  scanner.next();
            for (Contact p : contacts)
                if (p.getName().equalsIgnoreCase(name))
                {
                    System.out.println(p.toString());
                }
    }
}
