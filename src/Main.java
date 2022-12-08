public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println();
        for (int i = 1; i <= 10; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        //task2
        for (int i = 10; i >= 1; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        //task3
        for (int i = 0; i <= 17; i++){
            if (i % 2 == 0 && i != 0){
                System.out.print(i + " ");
            }
        }
        //task4
        System.out.println();
        for (int i = 10; i >= -10; i--){
            System.out.print(i + " ");
        }
        //task5
        System.out.println();
        for (int i = 1904; i <= 2096; i = i + 4){
            System.out.print(i + " год является високосным ");
        }
        //task6
        System.out.println();
        for (int i = 7; i <= 98; i = i + 7){
            System.out.print(i + " ");
        }
        //task7
        System.out.println();
        for (int i = 1; i <= 512; i *= 2){
            System.out.print(i + " ");
        }
        //task8
        System.out.println();
        for (int i = 1; i <= 12; i++){
            System.out.println("Месяц " + i + ", сумма накоплений равна " + 29000 * i + " рублей");
        }

    }
}