public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        //С помощью цикла for выведите в консоль все числа от 1 до 10.
        for (byte i = 1; i < 11; i++){
            System.out.println(i);
        }

        System.out.println("Задача №2");
        //С помощью цикла for выведите в консоль все числа от 10 до 1.
        for (byte a = 10; a > 0; a--){
            System.out.println(a);
        }

        System.out.println("Задача №3");
        //Выведите в консоль все четные числа от 0 до 17.
        for (byte b = 0; b < 17; b += 2){
            System.out.println(b);
        }

        System.out.println("Задача №4");
        //Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему.
        for (byte c = 10; c > -11; c--){
            System.out.println(c);
        }

        System.out.println("Задача №5");
        /*
        Напишите программу, которая выводит в консоль все високосные года,
        начиная с 1904 года до 2096. В консоль результат должен выводиться в формате:
        «… год является високосным».
         */
        for (short year = 1904; year <= 2096; year += 4){
            System.out.println(year + " год является високосным");
        }

        System.out.println("Задача №6");
        //Напишите программу, которая выводит в консоль последовательность чисел:
        for (short consistency = 7; consistency <= 98; consistency += 7){
            System.out.println(consistency);
        }

        System.out.println("Задача №7");
        //Напишите программу, которая выводит в консоль последовательность чисел:
        for (short consistency2 = 1; consistency2 <= 512;){
            System.out.println(consistency2);
            consistency2 *= 2;
        }

        System.out.println("Задача №8");
        /*
        Посчитайте с помощью цикла for сумму годовых накоплений,
        если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
        Выведите сумму накоплений за каждый месяц в консоль в формате:
        «Месяц …, сумма накоплений равна … рублей».
         */
        int accruals = 29000;
        int dayMoney = 0;
        for (int month = 1; month <=12; month++){
            dayMoney = dayMoney + accruals;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + dayMoney + " рублей");
        }

        System.out.println("Задача №9");
        /*
        Перепишите решение задачи выше при условии, что деньги вы откладывать будете
        не «в банку», а в банк под проценты — 12% годовых. Выведите сумму накоплений
        за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
         */
        int accumulations = 29000;
        int percentages = 0;
        for (byte month2 = 1; month2 <= 12; month2++){
            percentages = percentages + percentages / 100;
            percentages = percentages + accumulations;
            System.out.println("Месяц " + month2 + ", сумма накопления равна " + percentages + " рублей");
        }

        System.out.println("Задача №10");
        //Напишите программу, которая выводит в консоль таблицу умножения на 2:
        byte number = 1;
        for (byte multiplication = 2; multiplication <= 20; multiplication += 2){
            System.out.println("2 * " + number + " = " + multiplication);
            number++;
        }
    }
}