public class ProgrammingFundamentals {

    static String readln() {
        return new java.util.Scanner(System.in).nextLine();
    }

    public static void main(String args[]) {
        // Input utente
        int x=10;
        int y=25;
        x=12;

        System.out.println("Sum or Difference? (+/-)");
        String input = readln();

        String op, opDesc;
        if ("+".equals(input)) {
            op = "+";
            opDesc =
        } else if ("-".equals(input)) {


        } else {


        }

        ////////// FINCHÈ L'UTENTE IMMETTE UN NUMERO, SOMMARE O SOTTRARRE
        // QUANDO INVECE IMMETTE "stop", FERMARSI

        System.out.println("First number?")
        String number = readln();
        int total = Integer.parseInt(number);

        while (!"stop".equals(number)) {

            int z;

        }
        //////////

        // Output
        String msg = opDesc + " of x" + op + "y = ";
        msg = msg + x + op + y;
        msg = msg + " = " + z;

        System.out.println(msg);
    }
}
