package instructor.lesson_3.demo_1;

class PointDemo {

    public static void main(String[] args) {

        Point a = new Point(3, 2);
        a.x = 8;
        a.y = 9;

        Point b = new Point();
//        b.x = 2;
        b.y = 4;

        System.out.println("A(" + a.x + ":" + a.y + ")");
        System.out.println("B(" + b.x + ":" + b.y + ")");

        Point3D c = new Point3D(1, 2, 3);
        System.out.println("C(" + c.x + ":" + c.y + ":" + c.z + ")");

    }
}
