public class BitDemo {

    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        int c = 0;

        //Compares each bit of a and b. If both bits are 1, the result is 1; otherwise, it's 0.
        //Result: 111100 AND 001101 = 001100 (binary), which is 12 in decimal
        c = a & b;
        System.out.println("a & b = " + c);

        //Compares each bit of a and b. If either bit is 1, the result is 1; otherwise, it's 0.
        //Result: 111100 OR 001101 = 111101 (binary), which is 61 in decimal
        c = a | b;
        System.out.println("a & b = " + c);

        // Compares each bit of a and b. If the bits are different, the result is 1; if they're the same, it's 0.
        //Result: 111100 XOR 001101 = 110001 (binary), which is 49 in decimal.
        c = a ^ b;
        System.out.println("a & b = " + c);
        //Flips every bit of a. If the bit is 1, it becomes 0; if it's 0, it becomes 1.

        c = ~a;
        System.out.println("a & b = " + c);

        //Shifts all bits in a to the left by 2 positions. Bits on the left end are dropped,
        // and 0s are added on the right.
        //Result: 111100 shifted left by 2 = 110000 (binary), which is 240 in decimal
        c = a << 2;
        System.out.println("a & b = " + c);

        // Shifts all bits in a to the right by 2 positions. Bits on the right end are dropped.
        // For signed integers, the leftmost bit (which determines the sign) is replicated to
        // fill in the left.
        //Result: 111100 shifted right by 2 = 001111 (binary), which is 15 in decimal
        c = a >> 2;
        System.out.println("a & b = " + c);

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