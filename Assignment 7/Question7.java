public class Question7 {
    public static void main(String[] args) {
        // Immutable String
        String str1 = "Hello";
        String str2 = str1;  // Both str1 and str2 refer to the same "Hello" string

        System.out.println("Immutable String - Original String: " + str1);

        // Concatenating a new string creates a new string object
        str1 = str1 + " World";

        System.out.println("Immutable String - Modified String: " + str1);
        System.out.println("Immutable String - Original String (unchanged): " + str2);

        System.out.println();  // Separating the examples

        // Mutable StringBuffer
        StringBuffer stringBuffer1 = new StringBuffer("Hello");
        StringBuffer stringBuffer2 = stringBuffer1;  // Both stringBuffer1 and stringBuffer2 refer to the same StringBuffer object

        System.out.println("Mutable StringBuffer - Original StringBuffer: " + stringBuffer1);

        // Appending to the StringBuffer modifies the existing object
        stringBuffer1.append(" World");

        System.out.println("Mutable StringBuffer - Modified StringBuffer: " + stringBuffer1);
        System.out.println("Mutable StringBuffer - Original StringBuffer (also modified): " + stringBuffer2);
    }
}
