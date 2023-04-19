public class Main { // create a class attribute
    int x;
    public Main() { // create a CLASS CONSTRUCTOR for the main class
        x = 5; // set the initial value for the class attribute x
    }

    public static void main(String[] args) {
            Main myObj = new Main(); /*
            create an object of class Main;
            this will CALL THE CONSTRUCTOR
            */
        System.out.println(myObj.x); // print the value of x
    }
}