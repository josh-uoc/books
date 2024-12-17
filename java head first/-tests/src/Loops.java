public class Loops {
 
    public static void main(String[] args) {
        // Declare initial variables
        int x = 3;
        String name = "Josh";

        // Methods
        whileLoop(x);
        forLoop();
        conditionals(x, name);
        loopY();
    }

    // While loop
    public static void whileLoop(int x){
        while (x > 12){
            x = x - 1;
        }
        System.out.println("Final value of x after while loop: " + x);
    }

    // For loop
    public static void forLoop(){
        int x;
        for (x = 0; x < 10; x = x + 1){
            System.out.println("x is now " + x);
        }
    }

    // Conditionals
    public static void conditionals(int x, String name){
        if (x == 10){
            System.out.println("\nx must be 10.");
        } else{
            System.out.println("x isn't 10.");
        }

        if ((x < 3) && (name.equals("Josh"))){
            System.out.println("Hello!");
        }

        System.out.println("This line returns no matter what.");
    }

    // Control flow demo (loopy)
    public static void loopY(){
        int x = 1;
        System.out.println("\nBefore the loop.");
        while (x < 4){
            System.out.println("In the loop.");
            System.out.println("Value of x is " + x);
            x = x + 1;
        }
        System.out.println("This is after the loop.");
    }
}
