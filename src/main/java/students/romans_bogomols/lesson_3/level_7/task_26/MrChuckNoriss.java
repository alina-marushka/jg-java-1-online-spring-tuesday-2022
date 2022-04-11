package students.romans_bogomols.lesson_3.level_7.task_26;

class MrChuckNoriss {

    String name;
    boolean kickWithLeg;
    int age;
    String language;

    public MrChuckNoriss(String name, boolean kickWithLeg, int age, String language) {
        this.name = name;
        this.kickWithLeg = kickWithLeg;
        this.age = age;
        this.language = language;
    }

    void voice() {
        System.out.println("Hello, my name is " + name);
        System.out.println("I like to kick with my leg - " + kickWithLeg);
        System.out.println("My age is " + age + " and i'm immortal");
        System.out.println("My language is " + language);
    }
    boolean kickWithLegOn() {
      return kickWithLeg = true;
    }
    boolean kickWithLegOff() {
        return kickWithLeg = false;
    }
}
