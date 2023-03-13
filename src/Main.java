public class Main {

    public static void main(String[] args) {

        char charValue = 'X';
        System.out.println(charValue + " is " + changeCharToPhoneticAlphabet(charValue));

    }

    public static String changeCharToPhoneticAlphabet (char charValue) {

        switch (charValue) {
            case 'A':
                return "Able";
            case 'B':
                return "Baker";
            case 'C':
                return "Charlie";
            case 'D':
                return "Dog";
            case 'E':
                return "Easy";
            default:
                return "not found";
        }
    }
}
