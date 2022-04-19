package instructor.lesson_5.demo_8;

class PasswordGeneratorApplication {

    public static void main(String[] args) {

        Prompter prompter = new Prompter();
        int passwordLength = prompter.promptLength();
        boolean includeAlpha = prompter.promptAlpha();
        boolean includeNumeric = prompter.promptNumeric();
        boolean includeSpecial = prompter.promptSpecial();

        PasswordGenerator generator = new PasswordGenerator();
        String password = generator.generate(passwordLength, includeAlpha, includeNumeric, includeSpecial);

        System.out.println("Your password is '" + password + "'");

    }
}
