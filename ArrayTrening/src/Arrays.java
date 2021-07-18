public class Arrays {
    public static void main(String[] args) {

        int intArray[] = new int[2]; //Создается пустой массив типа интеджер и после присваивается длина  массива - 16
        intArray[0] = 12;  //Укаывается значение для элементов массива intArray
        intArray[1] = 456; //Укаывается значение для элементов массива intArray

        String StArray[] = new String[4]; //Создается пустой строковы массив и после присваивается длина массива - 3
        StArray[0] = "Небо";      //Укаывается значение для элементов массива StArray
        StArray[1] = "Упадет";    //Укаывается значение для элементов массива StArray
        StArray[2] = "В";         //Укаывается значение для элементов массива StArray
        StArray[3] = "Море";      //Укаывается значение для элементов массива StArray

        int[] intArray2 = new int[10]; //Создается пустой массив типа интеджер и после присваивается длина  массива - 10
        String[] StArray2 = new String[7]; //Создается пустой строковы массив и после присваивается длина массива - 7

        int[] intArray3 = new int[]{1, 5, 7, 8, 9, 4, 7, 15, 74}; //Создается пустой массив типа интеджер и после присваивются значения массива
        int[] intArray4 = {2, 5, 48, 45, 22, 14, 69, 74, 23, 5}; //Создается пустой массив типа интеджер и после присваивются значения массива

        String[] StArray3 = new String[]{"Солнце", "Встает", "На западе", "Садится", "На востоке"}; //Создается пустой строковы массив и после присваивются значения массива
        String[] StArray4 = {"Солнце", "Встает", "На западе", "Садится", "На востоке"}; //Создается пустой строковы массив и после присваивются значения массива

        int sizeStArray = StArray.length; //Обращение к длине массива StArray и сохранение ее в переменной sizeStArray
        int sizeintArray = intArray.length; //Обращение к длине массива intArray и сохранение ее в переменной sizeintArray


        System.out.println(StArray[sizeStArray - 1]); //выводим последний эемент для массива StArray. Так как индекс массива начинается с 0, а длинна с 1, то выводим элемент с индексом размер -1
        System.out.println(intArray[sizeintArray - 1]); //выводим последний эемент для массива intArray, так как индекс массива начинается с 0, а длинна с 1, то выводим элемент с индексом размер -1

        int intArray5[][] = {{1, 2, 23, 4}, {4, 7, 5, 8, 6, 9}}; //Создаем двумерный массив(таблица) и заполняем две строки
        int[][] intArray6 = new int[3][2]; //Создаем двумерный массив
        intArray6[0] = new int[]{1, 8}; //Первое значение первой строки массива intArray6 задаем как новый одномерный массив
        intArray6[1] = new int[]{8, 4, 7, 5, 14, 8, 6, 4, 8}; //Второе значение первой строки массива intArray6 задаем как новый одномерный массив
        intArray6[2] = new int[]{1, 5, 4, 8}; //Третье значение первой строки массива intArray6 задаем как новый одномерный массив
        intArray6[0][1] = 5;
        intArray6[1][1] = 3;
         for (int i : intArray4){  System.out.println(i); } //Построчный вывод массива через цикл foreach

        String s = "";
        for (int i : intArray4) { //для вывода в одну строку в цикле foreach
            s = s + " " + i;       //в строковой переменной сохраняем значения массива + пробел
        }

        System.out.println(s);// вывод строковой переменной, которую заполнили в цикле

        for (int i = 0; i < intArray6.length; i++) {  //вывод многомерного массива
            for (int j = 0; j < intArray6[i].length; j++) {
                System.out.printf("|" + intArray6[i][j] + "|");
            }System.out.println();
        }
    }

}
