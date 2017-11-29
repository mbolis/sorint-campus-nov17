public class ProgrammingFundamentals {
    public static void main(String args[]) {
        // Input utente
        int x=10;
        int y=25;
        x=12;
        
        int z;
        String op, opDesc;
        
        // SE X MAGGIORE DI Y ALLORA SOTTRAZIONE ALTRIMENTI SOMMA
        // IF X > Y THEN SUBTRACTION ELSE SUM
        if (x > y) {
            z = x - y;
            op = "-";
            opDesc = "Difference";
        } else {
            z = x + y;
            op = "+";
            opDesc = "Sum";
        }

        // Output
        String msg = opDesc + " of x" + op + "y = ";
        msg = msg + x + op + y;
        msg = msg + " = " + z;

        System.out.println(msg);
    }
}
