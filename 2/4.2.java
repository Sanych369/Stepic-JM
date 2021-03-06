/*

Напишите метод evenArray который принимает целое число типа int и возвращает массив заполненный четными числами от 1 до этого числа.

Пример ввода: 8
Пример вывода: [2,4,6,8]
 
Требования:
1. Метод должен быть публичным.
2. Параметр должен иметь тип int.
3. Сигнатура метода должна быть: evenArray(int number)

*/

public int[] evenArray(int number) {
    int[] arr = new int[number / 2 ];    // Создаём новый массив с длинной, меньшей в 2 раза(т.к. только чётные нужны)
    for (int i = 1; i <= number ; i++) { // Перебираем в цикле все числа от 1 до number, потому что число 0 нам по условию не нужно
        if (i % 2 == 0) {                // Если число делится на 2 без остатка, то
            arr[i / 2 - 1] = i;          // Ставим в позицию в массиве. На примере: 2 на позиции 0( 2 / 2 - 1 = 0 ), 4 на позиции 1 (4 / 2 - 1 = 1)и т.д.
        }
    } 
    return arr;                          // Возвращаем массив, который заполнили только чётными числами
}
