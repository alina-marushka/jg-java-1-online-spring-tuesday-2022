package instructor.lesson_5.demo_8;

import java.util.Random;

class PasswordGenerator {

    Random random;

//    char[] symbols = {
//            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
//
//            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
//            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
//
//            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
//            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
//
//            '!', '@', '#', '$', '%', '*'
//    };

    char[] alpha = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',

            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };

    char[] numeric = {
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
    };

    char[] special = {
            '!', '@', '#', '$', '%', '*'
    };

    PasswordGenerator() {
        this.random = new Random();
    }

//    String generate(int length) {
//        char[] password = new char[length];
//
//        for (int i = 0; i < password.length; i++) {
//            password[i] = symbols[random.nextInt(symbols.length)];
//        }
//
//        return new String(password);
//    }

    String generate(int length, boolean includeAlpha, boolean includeNumeric, boolean includeSpecial) {
        char[] password = new char[length];
        char[] symbols = createSymbolArray(includeAlpha, includeNumeric, includeSpecial);

        for (int i = 0; i < password.length; i++) {
            password[i] = symbols[random.nextInt(symbols.length)];
        }

        return new String(password);
    }

    char[] createSymbolArray(boolean includeAlpha, boolean includeNumeric, boolean includeSpecial) {
        int length = 0;

        if (includeAlpha) {
            length += alpha.length;
        }

        if (includeNumeric) {
            length += numeric.length;
        }

        if (includeSpecial) {
            length += special.length;
        }

        char[] buffer = new char[length];
        int cursor = 0;

        if (includeAlpha) {
            for (char c : alpha) {
                buffer[cursor] = c;
                cursor++;
            }
        }

        if (includeNumeric) {
            for (char c : numeric) {
                buffer[cursor] = c;
                cursor++;
            }
        }

        if (includeSpecial) {
            for (char c : special) {
                buffer[cursor] = c;
                cursor++;
            }
        }

        return buffer;
    }
}
