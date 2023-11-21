class Question5 {
    public static void main(String[] args) {
        char startLetter = 'A';
        for (int i = 0; i < 5; i++) {
            System.out.print(startLetter);
            System.out.print((char)(startLetter + 12));
            System.out.print((char)(startLetter + 12));
            System.out.print(" ");
            startLetter = (char)(startLetter + 2);
        }
    }
}
