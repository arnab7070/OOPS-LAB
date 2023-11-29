// Write a program that takes one string and two integers as command line argument and prints the reverse of the substring of
// the string specified by the two numbers. The program should handle all possible exception that may arise due to bad input.
class Prog8 {
    public static void main(String[] args) {
        try {
            String s = args[0];
            int n1 = Integer.parseInt(args[1]);
            int n2 = Integer.parseInt(args[2]);
            StringBuffer s2 = new StringBuffer();

            if (n1 > n2) {
                throw new IllegalArgumentException("Ei sala amake ki peyecho tumi first pointer ta pichiye diyecho kano kana madon amar ami ki pechon theke kaj korbo naki");
            }

            for (int i = n1; i <= n2; i++) {
                s2.append(s.charAt(i));
            }

            s2.reverse();
            System.out.println(s2);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Bhai gune de ontoto string er length er baire beriye geche kono ekta integer tor matal");
        } catch (NumberFormatException e) {
            System.out.println("Ore madon string ke ami number e parseInt korbo ami ki bangla kheyechi naki tor moto. Thik kore de number de number 2nd argument ar 3rd argument ta number hobe");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Harami tinte argument cheyeche ekta string ekta number ar ekta number . thik kore de ekta string duto number");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
