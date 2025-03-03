public class Driver {

    // instance variable declared within class but outside method
    int instanceVariable = 20;

    public static void main(String[] args) {

        // local variable x declared within the main method
        int x = 10;
        System.out.println("Local Variable: " + x);

        // create Driver object to access and print the instance variable
        Driver obj = new Driver();
        System.out.println("Instance Variable: " + obj.instanceVariable);

        // call the add method with arguments 5 and 10
        int addition = add(5,10);
        System.out.println("Sum of parameters: num1 + num2 = " + addition);
    }

    public static int add(int num1, int num2) {
        // local variable sum declared within add method
        int sum = 0;
        sum = num1 + num2;
        return sum;
    }
}
