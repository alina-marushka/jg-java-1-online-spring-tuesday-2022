package students.dmitry_makarov.lesson_4.level_3.task_8;

 class SubsequenceCalc {
     int aNum1;
     int bNum2;
     int cNum3;

     SubsequenceCalc(int num1, int num2, int num3) {
         this.aNum1 = num1;
         this.bNum2 = num2;
         this.cNum3 = num3;
     }

     void compare() {
         if (aNum1 < bNum2 && bNum2 < cNum3) {
             System.out.println("increasing");
         } else if (aNum1 > bNum2 && bNum2 > cNum3) {
             System.out.println("decresing");
         } else {
             System.out.println("neither");
         }
     }
 }
