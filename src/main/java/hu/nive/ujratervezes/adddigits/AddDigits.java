package hu.nive.ujratervezes.adddigits;

public class AddDigits {

    public int addDigits(String input) {

        if (input == null || input.equals("")) {

            return -1;

        }

        int sum = 0;
        char[] array = input.toCharArray();

        for (char c : array) {

            String temp = Character.toString(c);

            try {

                int charValue = Integer.parseInt(temp);
                sum += charValue;

            } catch (Exception ignored) {
            }

        }

        return sum;

    }

}
