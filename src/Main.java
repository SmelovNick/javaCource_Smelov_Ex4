import java.util.Scanner;

//С клавиатуры вводится двумерный массив, длина его строк – 4, столбцов – 3.
//
//        1.Напишите программу, которая выводит номера строк и суммы их элементов (пример: Line 2: 17).
//
//        2.Напишите программу, которая выводит номера столбцов и суммы их элементов (пример: Column 3: 21).
//
//        3.Напишите программу, которая заменяет все нечётные элементы массива на 1, а чётные на 0 и выводит его на экран.
//
//        4.Напишите программу, которая для в каждой строке находит целое среднее арифметическое и выводит его на экран.
//
//        5.***Напишите программу, которая преобразует двумерный массив в перевёрнутый одномерный и выводит все элементы одномерного массива на экран.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = 4;
        int columns = 3;
        int [][] array = new int[rows][columns];

        System.out.print("Please input 12 numbers: ");

        //заполняем массив значениями
        for (int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                array[i][j] = scanner.nextInt();
            }
        }

        //отобразим полученный массив в консоль для наглядности
        System.out.println("Your array is:");
        for (int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Program #1");
        //программа 1
        {
            for (int i = 0; i < rows; i++) {

                int sum = 0;
                for (int j = 0; j < columns; j++) {
                    sum += array[i][j];
                }
                System.out.printf("Line%d: %d", i, sum);
                System.out.println();
            }
        }

        System.out.println();

        //программа 2
        System.out.println("Program #2");
        {
            for (int i = 0; i < columns; i++) {
                int sum = 0;
                for (int j = 0; j < rows; j++) {
                    sum += array[j][i];
                }
                System.out.printf("Column%d: %d", i, sum);
                System.out.println();
            }
        }

        System.out.println();

        //программа 3
        System.out.println("Program #3");
        {
            //скопируем исходный массив, чтобы его не сломать
            int[][] arrayClone = new int[rows][columns];
            for(int i=0; i< rows; i++)
                for(int j=0; j<columns; j++)
                    arrayClone[i][j]=array[i][j];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    arrayClone[i][j] = arrayClone[i][j] % 2 > 0 ? 1 : 0;
                    System.out.printf("%d ", arrayClone[i][j]);
                }
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("Program #4");
        //программа 4
        {
            for (int i = 0; i < rows; i++) {
                int sum = 0;
                for (int j = 0; j < columns; j++) {
                    sum+=array[i][j];
                }
                double result = (double)sum/columns;
                System.out.printf("Line %d, average is %2.2f", i, result);
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("Program #5");
        //программа 5
        {
            int[] invertedArray = new int[rows * columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    invertedArray[i * columns + j] = array[rows - 1 - i][columns - 1 - j];
                }
            }
            for (int num : invertedArray) {
                System.out.printf("%d ", num);
            }
        }
    }
}
