public class Question5 {
    public static void main(String[] args) {
        String currentSequence = "AMM";
        int numberOfTerms = 5;

        System.out.println("Alphabet Sequence:");
        for (int i = 0; i < numberOfTerms; i++) {
            System.out.println(currentSequence);
            currentSequence = generateNextTerm(currentSequence);
        }
    }
    private static String generateNextTerm(String currentTerm) {
        StringBuilder nextTerm = new StringBuilder();
        for (char c : currentTerm.toCharArray()) {
            if (Character.isLetter(c)) {
                char nextLetter = (char) ((c - 'A' + 1) % 26 + 'A');
                nextTerm.append(nextLetter);
            } else {
                nextTerm.append(c);
            }
        }
        return nextTerm.toString();
    }
}