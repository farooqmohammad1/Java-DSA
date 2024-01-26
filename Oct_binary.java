public class Oct_binary {
    public static void main(String[] args) {

        int octalNumber = 15;

        // Step 1: Octal to Decimal
        int decimalNumber = convertOctalToDecimal(octalNumber);

        // Step 2: Decimal to Binary
        int binaryNumber = convertDecimalToBinary(decimalNumber);

        System.out.println("Octal to Decimal: " + decimalNumber);
        System.out.println("Decimal to Binary: " + binaryNumber);
    }

    // Function to convert octal to decimal
    private static int convertOctalToDecimal(int octalNumber) {
        int decimalNumber = 0, mul = 1, rem;

        while (octalNumber > 0) {
            rem = octalNumber % 10;
            octalNumber = octalNumber / 10;
            decimalNumber += rem * mul;
            mul = mul * 8;
        }

        return decimalNumber;
    }

    // Function to convert decimal to binary
    private static int convertDecimalToBinary(int decimalNumber) {
        int binaryNumber = 0, mul = 1, rem;

        while (decimalNumber > 0) {
            rem = decimalNumber % 2;
            decimalNumber = decimalNumber / 2;
            binaryNumber += rem * mul;
            mul = mul * 10;
        }

        return binaryNumber;


        /*
         public class OctalToBinary {
    public static void main(String[] args) {
        int octalNumber = 15;
        int decimalNumber = 0, binaryNumber = 0, count = 0;

        // Convert octal to decimal
        while (octalNumber != 0) {
            decimalNumber += (octalNumber % 10) * Math.pow(8, count);
            ++count;
            octalNumber /= 10;
        }

        count = 1;

        // Convert decimal to binary
        while (decimalNumber != 0) {
            binaryNumber += (decimalNumber % 2) * count;
            decimalNumber /= 2;
            count *= 10;
        }

        System.out.println("Binary equivalent: " + binaryNumber);
    }
}

         */
    }
}
