package AbstractClasses;


public class Abstract {

    public static void main(String[] args) {

        Admin currentAdmin = new Admin(1274, "Kelvin", "Kelvin@123");

        User currentUser = new User(7335, "Kayla");

        currentAdmin.performOperation(new Update());

        currentUser.performOperation(new View());


    }

}
