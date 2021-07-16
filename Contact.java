public class Contact{
    private String phoneNumber;
    private String group;
    private String name;
    private String gender;
    private String address;
    private String email;

    public Contact() {
    }

    public Contact(String phoneNumber, String group, String name, String gender, String address, String email) {
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact [address=" + address + ", email=" + email + ", gender=" + gender + ", group=" + group
                + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
    }
}