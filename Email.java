package emailapp;

import java.util.Scanner;

public class Email {
    private final String firstName;
    private final String lastName;
    private String passWord;
    private String department;
    private final String email;
    private int mailCapacity = 500;
    private String alternateEmail;
    Scanner input = new Scanner(System.in);
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    this.department = setDepartment();
        int defaultPasswordLength = 10;
        this.passWord = randomPassword(defaultPasswordLength);
        String company = "company.com";
        email = this.firstName+this.lastName+this.department+"@"+ company;
    }
    public void getPassword(String passWord){
        this.passWord = passWord;
    }
    private String setDepartment(){
        System.out.println("New worker "+firstName+" "+lastName+" Enter the department code \n 1 - Sales\n 2- Development\n 3 - Accounting\n");
        int choice = input.nextInt();
        switch (choice){
            case 1: this.department = "Sales"; break;
            case 2: this.department = "Development"; break;
            case 3: this.department = "Accounting";
                    break;
            default: System.out.println("Enter valid choice");
        }
        return this.department;
    }

    private String randomPassword(int length){
        String passwordSet = "123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*";
        char[] password = new char[length];
        for(int i =0; i < length;i++){
            int rand = (int) (Math.random()*passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        input.close();
        return new String(password);
    }
    public void setMailCapacity(int mailCapacity){
        this.mailCapacity = mailCapacity;
    }

    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail = alternateEmail;
    }
    public void changePassword(String passWord){
        this.passWord = passWord;
    }
    public int getMailCapacity(){return this.mailCapacity;}
    public String getPassWord(){return this.passWord;}
    public String getAlternateEmail(){return this.alternateEmail;}
    public String show(){
        if(department==null)
            return "Enter a valid choice";
    return "\n DISPLAY NAME: "+firstName+" "+ lastName+
            "\n COMPANY EMAIL: "+email+
            "\n PASSWORD: "+passWord;
    }

}
