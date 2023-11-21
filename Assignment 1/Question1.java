class Question1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers as command line arguments.");
            return;
        }
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        System.out.println("Arithmetic Operations between " + num1 + " and " + num2 + ":");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
