public class PrimitiveWrapperConversion6a {

    public static void main(String[] args) {

        // Primitive to Wrapper (Autoboxing)
        int primitiveInt = 10;
        Integer wrapperInt = Integer.valueOf(primitiveInt); // Using valueOf method
        System.out.println("Primitive int to Wrapper Integer: " + wrapperInt);

        double primitiveDouble = 20.5;
        Double wrapperDouble = Double.valueOf(primitiveDouble); // Using valueOf method
        System.out.println("Primitive double to Wrapper Double: " + wrapperDouble);

        char primitiveChar = 'A';
        Character wrapperChar = Character.valueOf(primitiveChar); // Using valueOf method
        System.out.println("Primitive char to Wrapper Character: " + wrapperChar);

        // Wrapper to Primitive (Unboxing)
        Integer wrapperInt2 = 30;
        int primitiveInt2 = wrapperInt2.intValue(); // Using intValue method
        System.out.println("Wrapper Integer to Primitive int: " + primitiveInt2);

        Double wrapperDouble2 = 40.7;
        double primitiveDouble2 = wrapperDouble2.doubleValue(); // Using doubleValue method
        System.out.println("Wrapper Double to Primitive double: " + primitiveDouble2);

        Character wrapperChar2 = 'B';
        char primitiveChar2 = wrapperChar2.charValue(); // Using charValue method
        System.out.println("Wrapper Character to Primitive char: " + primitiveChar2);

        // Using autoboxing and unboxing directly
        Integer autoBoxedInt = primitiveInt; // Auto-boxing
        int unboxedInt = wrapperInt2; // Auto-unboxing
        System.out.println("Auto-boxed Integer: " + autoBoxedInt);
        System.out.println("Auto-unboxed int: " + unboxedInt);
    }
}
