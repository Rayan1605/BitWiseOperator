public class BitDemo {

    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        int c = 0;

        c = a & b;
        System.out.printf("a & b = " + c);

        c = a | b;
        System.out.printf("a & b = " + c);

        c = a ^ b;
        System.out.printf("a & b = " + c);

        c = ~a;
        System.out.printf("a & b = " + c);

        c = a << 2;
        System.out.printf("a & b = " + c);

        c = a >> 2;
        System.out.printf("a & b = " + c);






    }
}

//Bitwise and Bit Shift Operator
// | Bitwise inclusive OR // Compares each bit of its first operand to the corresponding bit of
// its second operand. If either bit is 1, the corresponding result bit is set to 1. Otherwise,
// it is set to 0.

// ^ Bitwise exlusive OR // Compares each bit of its first operand to the corresponding bit of its
// second operand. If the bits are different, the corresponding result bit is set to 1.
// If the bits are the same, the result bit is set to 0.

// & Bitwise AND // Compares each bit of its first operand to the corresponding
// bit of its second operand. If both bits are 1,
// the corresponding result bit is set to 1. Otherwise, it is set to 0.

/// Unsigned right shift // Shifts the bits of the first operand to the right by the number of
// positions specified by the second operand.

// Signed right shift / Shifts the bits of the first operand to the right by the number of
// positions specified by the second operand
// Signed left shift / Shifts the bits of the first operand to the left by the number of
// positions specified by the second operand. Zeros are shifted in from the right.
// ~ Unary bitwise complement // all the 0 bits become 1s, and all the 1 bits become 0s.