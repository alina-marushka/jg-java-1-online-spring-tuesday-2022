package instructor.dmitry_makarov.lesson_3.level_7.task_26;

 class GuitarDemo {
    public static void main(String[] args) {

        Guitar guitar1= new Guitar ("Jackson", "Performer", "black", 6, 1);
        guitar1.output ();

        Guitar guitar2 = new Guitar("Ibanez", "Talman", "sunburst", 6, 0);
        guitar2.output ();
    }
}
