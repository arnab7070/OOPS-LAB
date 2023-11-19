// Write a program for multiple catch to fire ArrayIndexOutOfBoundsException and StringIndexOutOfBoundsException both
class Prog2 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[5] = 3;

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            try {
                String s = "Supratik";
                System.out.println(s.charAt(8));
            } catch (StringIndexOutOfBoundsException e1) {
                System.out.println(e1.getMessage());
            }
        } finally {
            System.out.println("Some clean up code");
        }
    }
}
