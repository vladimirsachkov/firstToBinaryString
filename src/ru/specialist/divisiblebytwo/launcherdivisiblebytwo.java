package ru.specialist.divisiblebytwo;

public class launcherdivisiblebytwo {
    public static void main(String[] args) {
        System.out.println("Сначала объявим несколько чисел от 0 до 16");
        System.out.println("First, let's declare some numbers from 0 to 16");
        System.out.println("");
        System.out.println("ЧИСЛА/NUMBERS:");

        int numberInt1 = 1;
        int numberInt2 = 2;
        int numberInt3 = 3;
        int numberInt4 = 4;
        int numberInt5 = 5;
        int numberInt6 = 6;
        int numberInt7 = 7;
        int numberInt8 = 8;
        int numberInt9 = 9;
        int numberInt10 = 10;
        int numberInt11 = 11;
        int numberInt12 = 12;
        int numberInt13 = 13;
        int numberInt14 = 14;
        int numberInt15 = 15;
        int numberInt16 = 16;

        System.out.println(numberInt1);
        System.out.println(numberInt2);
        System.out.println(numberInt3);
        System.out.println(numberInt4);
        System.out.println(numberInt5);
        System.out.println(numberInt6);
        System.out.println(numberInt7);
        System.out.println(numberInt8);
        System.out.println(numberInt9);
        System.out.println(numberInt10);
        System.out.println(numberInt11);
        System.out.println(numberInt12);
        System.out.println(numberInt13);
        System.out.println(numberInt14);
        System.out.println(numberInt15);
        System.out.println(numberInt16);


        System.out.println();
        System.out.println("РУС: Затем переводим эти числа в двоичную систему счисления.");
        System.out.println("ENG: Then we translate these numbers into a binary numbers system.");
        System.out.println();

        System.out.format("%s - %s\n", numberInt1, Integer.toBinaryString(numberInt1));
        System.out.format("%s - %s\n", numberInt2, Integer.toBinaryString(numberInt2));
        System.out.format("%s - %s\n", numberInt3, Integer.toBinaryString(numberInt3));
        System.out.format("%s - %s\n", numberInt4, Integer.toBinaryString(numberInt4));
        System.out.format("%s - %s\n", numberInt5, Integer.toBinaryString(numberInt5));
        System.out.format("%s - %s\n", numberInt6, Integer.toBinaryString(numberInt6));
        System.out.format("%s - %s\n", numberInt7, Integer.toBinaryString(numberInt7));
        System.out.format("%s - %s\n", numberInt8, Integer.toBinaryString(numberInt8));
        System.out.format("%s - %s\n", numberInt9, Integer.toBinaryString(numberInt9));
        System.out.format("%s - %s\n", numberInt10, Integer.toBinaryString(numberInt10));
        System.out.format("%s - %s\n", numberInt11, Integer.toBinaryString(numberInt11));
        System.out.format("%s - %s\n", numberInt12, Integer.toBinaryString(numberInt12));
        System.out.format("%s - %s\n", numberInt13, Integer.toBinaryString(numberInt13));
        System.out.format("%s - %s\n", numberInt14, Integer.toBinaryString(numberInt14));
        System.out.format("%s - %s\n", numberInt15, Integer.toBinaryString(numberInt15));
        System.out.format("%s - %s\n", numberInt16, Integer.toBinaryString(numberInt16));

        System.out.println();
        System.out.println("РУС: Повторим только те числа, которые делятся на два без остатка");
        System.out.println("ENG: We will repeat only those numbers that are divisible by two without a remainder");
        System.out.println();

        System.out.format("%s - %s\n", numberInt2, Integer.toBinaryString(numberInt2));
        System.out.format("%s - %s\n", numberInt4, Integer.toBinaryString(numberInt4));
        System.out.format("%s - %s\n", numberInt8, Integer.toBinaryString(numberInt8));
        System.out.format("%s - %s\n", numberInt16, Integer.toBinaryString(numberInt16));

        System.out.println();
        System.out.println("РУС: Все эти числа и имеют нули после единственной единицы. Следовательно в двоично системе числения " +
                "- это и есть признак деления на два.");
        System.out.println("ENG: All these numbers have zeros after the only one. Therefore, in a binary number system, " +
                "this is the sign of division by two.");
        System.out.println();

        System.out.println("РУС: Чтобы праверить число на деление на ноль я разботал такой алгоритм.");
        System.out.println("ENG: To correct a number for division by zero, I worked out such an algorithm.");
        System.out.println();

        System.out.println("РУС: Обявляем число 256");
        System.out.println("ENG: Let's declare the number 256");
        System.out.println();

        int numberInt256 = 256;
        System.out.println(numberInt256);

        System.out.println();
        System.out.println("РУС: Переводим число в двоичную систему счисления");
        System.out.println("ENG: Converting a number to a binary number system ");
        System.out.println();

        String binaryNumberInt256 = Integer.toBinaryString(numberInt256);
        System.out.println(binaryNumberInt256);
        System.out.println();
        System.out.println("РУС: Заменяем 10 на #.");
        System.out.println("ENG: Replace 10 with #");
        System.out.println();
        String binaryNumberInt256Replaced10withSharp = binaryNumberInt256.replace("10", "#");
        System.out.println(binaryNumberInt256Replaced10withSharp);
        System.out.println();

        System.out.println("РУС: Убираем все нули.");
        System.out.println("ENG: We remove the zeros.");
        System.out.println();

        String binaryNumberInt256Replaced10withSharpWithoutZero = binaryNumberInt256Replaced10withSharp.replace("0", "");
        System.out.println(binaryNumberInt256Replaced10withSharpWithoutZero);
        System.out.println();

        System.out.println("РУС: Заменяем # обратно на 10.");
        System.out.println("END: Replace # back with 10.");
        System.out.println("");

        binaryNumberInt256  = binaryNumberInt256Replaced10withSharpWithoutZero.replace("#", "10");
        System.out.println(binaryNumberInt256);
        System.out.println();

        System.out.println("РУС: Переводим число в десятичную систему счисления.");
        System.out.println("END: We translate the number into the decimal number system.");
        System.out.println();

        int decimalNumberInt256withoutZeros = Integer.parseInt(binaryNumberInt256, 2);
        System.out.println(decimalNumberInt256withoutZeros);
        System.out.println();

        System.out.println("РУС: Если чтсло будет равняться жвум, то входящее число делится на два.");
        System.out.println("END: If the value is equal to wup, the input number is divided by two");
    }
}
