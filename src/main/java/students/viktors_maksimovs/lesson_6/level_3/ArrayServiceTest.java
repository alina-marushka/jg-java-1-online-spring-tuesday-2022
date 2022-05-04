package students.viktors_maksimovs.lesson_6.level_3;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.numberInsideTrue();
        test.numberInsideTrueOne();
        test.numberInsideFalse();
        test.numberCount();
        test.numberCountTwo();
        test.numberCountOne();
        test.replaceFirstOccurence();
        test.replaceFirstOccurenceOne();
        test.replaceAll();
        test.replaceAllOne();
        test.replaceAllTwo();

    }
    int[] i = {1,2,3,4,5,5,6,7,-1,-2,50,5};

    void numberInsideTrue() {
        ArrayService inside = new ArrayService();
        boolean actual = inside.contains( i,4);
        assertThatEqual( true, actual, "Number is inside array: ");

    }

    void numberInsideTrueOne() {
        ArrayService inside = new ArrayService();
        boolean actual = inside.contains( i,-1);
        assertThatEqual( true, actual, "Number is inside array: ");

    }

    void numberInsideFalse() {
        ArrayService inside = new ArrayService();
        boolean actual = inside.contains( i,8);
        assertThatEqual( false, actual, "Number is not inside array: ");

    }

    void numberCount() {
        ArrayService count = new ArrayService();
        int actual = count.countOccurrences(i, 5);
        assertThatEqual(3, actual, " Occurence count = " + actual);
    }

    void numberCountOne() {
        ArrayService count = new ArrayService();
        int actual = count.countOccurrences(i, -2);
        assertThatEqual(1, actual, " Occurence count = " + actual);
    }

    void numberCountTwo() {
        ArrayService count = new ArrayService();
        int actual = count.countOccurrences(i, 55);
        assertThatEqual(0, actual, " Occurence count = " + actual);
    }

    void replaceFirstOccurence () {
        ArrayService replace = new ArrayService();
        boolean actual = replace.replaceFirst(i,5,10);
        assertThatEqual(true, actual, "Number replaced " );
    }

    void replaceFirstOccurenceOne () {
        ArrayService replace = new ArrayService();
        boolean actual = replace.replaceFirst(i,200,10);
        assertThatEqual(false, actual, "Number replaced " );
    }
    void replaceAll() {
        ArrayService count = new ArrayService();
        int actual = count.replaceAll(i, 5,10);
        assertThatEqual(3, actual, " Replaced numbers  = " + actual);
    }

    void replaceAllOne() {
        ArrayService count = new ArrayService();
        int actual = count.replaceAll(i, -2,100);
        assertThatEqual(1, actual, " Replaced numbers = " + actual);
    }

    void replaceAllTwo() {
        ArrayService count = new ArrayService();
        int actual = count.replaceAll(i, 55, 100);
        assertThatEqual(0, actual, " Replaced numbers = " + actual);
    }


    void assertThatEqual(boolean expected,  boolean actual, String scenario) {
        if (expected == actual) {
            System.out.println("[ OK ]: " + scenario + " - PASS!");
        } else {
            System.out.println("[FAIL]: " + scenario + " - FAIL!");
        }
    }

    void assertThatEqual(int expected,  int actual, String scenario) {
        if (expected == actual) {
            System.out.println("[ OK ]: " + scenario + " - PASS!");
        } else {
            System.out.println("[FAIL]: " + scenario + " - FAIL!");
        }
    }



}
