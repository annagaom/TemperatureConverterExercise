
public class StringManipulatorAnna {

    // Metodi kääntää annetun merkkijonon
    public String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        StringBuilder reversedString = new StringBuilder(input);
        return reversedString.reverse().toString();
    }

    // Metodi muuttaa jokaisen annetun sanan ensimmäisen kirjaimen isoksi
    public String capitalize(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        String[] words = input.split("\\s+");
        StringBuilder capitalizedString = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                capitalizedString.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return capitalizedString.toString().trim();
    }
}
