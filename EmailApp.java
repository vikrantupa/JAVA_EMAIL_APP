package emailapp;
//this class contains only
import emailapp.Email;
public class EmailApp  {
    public static void main(String[] args) {
        //employee 1 details with a totally random password
        Email employeeOne = new Email("Vikrant","Upadhyay");
        employeeOne.setMailCapacity(20);
        employeeOne.setAlternateEmail("alternate@email.com");
        System.out.println(employeeOne.show()+" Alternate Email added is: "+employeeOne.getAlternateEmail());
    //employee 2 details with a totally random password
    Email employeeTwo = new Email("Dhruv","Upadhyay");
        System.out.println(employeeTwo.show());
    //employee 3 details with a totally random password
        Email employeeThree = new Email("Akansha","Reddy");
        System.out.println(employeeThree.show());
    }
}
