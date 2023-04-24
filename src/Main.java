public class Main {
    // create a class attribute 'x':
    int x;
    public Main() { // create a CLASS CONSTRUCTOR for the main class
        x = 5; // CONSTRUCTOR - set the initial value for the class attribute x
    }

    public static void main(String[] args) {
            Main myObj = new Main(); /*
            create an object of class Main;
            this will CALL THE CONSTRUCTOR to instantiate myObj
            with a property(attribute) called 'x'
            with a value 5.
            */
        System.out.println(myObj.x);
        /* print the value of x
        as set in the constructor method
        of the Main class
         */

    }
}