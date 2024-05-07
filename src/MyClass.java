public class MyClass {
    public static void main(String[] args) {
            String firstName = "Vinicius";
            String secondName = "Lemes";
            String fullName = fullName(firstName, secondName);
    }

    public static String fullName(String firstName, String secondName) {
        return firstName.concat(" ").concat(secondName);
    }
}
