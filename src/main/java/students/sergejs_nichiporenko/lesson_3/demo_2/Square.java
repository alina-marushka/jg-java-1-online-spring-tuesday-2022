package students.sergejs_nichiporenko.lesson_3.demo_2;

class Square {
    int sideLenght;

    public Square(int sideLenght) {
        this.sideLenght = sideLenght;
    }

    int perimeter(){
        int p = sideLenght * 4;
        return p;
    }

    int area() {
        int a = sideLenght * sideLenght;
        return a;
    }

    void expandBy(int length){
        sideLenght += length;//        sideLenght = sideLenght + length;

    }

    void shrinkBy(int length){
        sideLenght -= length;//        sideLenght = sideLenght + length;

    }

    void printInformation() {
        System.out.println("-=Square=-");
        System.out.println("Square length = " + sideLenght);
        System.out.println("Square perimeter = " + perimeter());
        System.out.println("Square area = " + area());
        System.out.println();
    }
}
