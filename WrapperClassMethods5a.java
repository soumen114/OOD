public class WrapperClassMethods5a {
    public static void main(String[] args) {
        // Integer Wrapper Class
        Integer intObj = 10;
        System.out.println("Integer to String: " + intObj.toString()); 
        System.out.println("Parse String to Integer: " + Integer.parseInt("20"));
        
        // Double Wrapper Class
        Double doubleObj = 10.5;
        System.out.println("\nDouble to String: " + doubleObj.toString());
        System.out.println("Parse String to Double: " + Double.parseDouble("20.5"));
        
        // Character Wrapper Class
        Character charObj = 'A';
        System.out.println("\nCharacter to String: " + charObj.toString());
        System.out.println("Is 'A' a letter? " + Character.isLetter(charObj));
        
        // Boolean Wrapper Class
        Boolean boolObj = true;
        System.out.println("\nBoolean to String: " + boolObj.toString());
        System.out.println("Parse String to Boolean: " + Boolean.parseBoolean("false"));
    }
}
