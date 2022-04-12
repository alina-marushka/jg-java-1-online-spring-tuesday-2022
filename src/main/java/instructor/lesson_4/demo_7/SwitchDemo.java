package instructor.lesson_4.demo_7;

class SwitchDemo {

    public static void main(String[] args) {

        String today = "sunday";

        switch (today) {
            case "monday":
                System.out.println("Oh no");
//                break;

            case "tuesday":
                System.out.println("java time");
//                break;

            case "wednesday":
                System.out.println("small friday");
//                break;

            case "thursday":
                System.out.println("i have no idea what to write here");
//                break;

            case "friday":
                System.out.println("party");
                System.out.println("Work Day");
                break;

            case "saturday":
                System.out.println("zzz...");
                break;

            case "sunday":
                System.out.println("almost monday");
                break;

            default:
                System.out.println("No such day in the week");
        }

        switch (today) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("Work Day");
                break;

            case "saturday":
            case "sunday":
                System.out.println("Weekend");
                break;
        }

        switch (today) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> {
                System.out.println("Work Day");
                System.out.println("Work Day");
                System.out.println("Work Day");
            }

            case "saturday", "sunday" -> System.out.println("Weekend");
            default -> System.out.println("No such thing");
        }
    }

}
