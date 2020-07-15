/*

Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив. Массивы могут быть любой длины, в том числе нулевой.

Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность: он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий массив. Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась.

К сожалению, автоматически это не проверить, так что это остается на вашей совести :)

Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.

Пример ввода: {0, 2, 2} и {1, 3}
Пример вывода: {0, 1, 2, 2, 3}
 
Требования:
Cигнатура метода должна быть: mergeArrays(int[] a1, int[] a2)

*/

public static int[] mergeArrays(int[] a1, int[] a2) {
    int[] a3 = new int[a1.length + a2.length];                      // Создаём новый массив, длина которого равна сумме длин двух поданных на вход массивов
    int min;                                                        // Создаём переменную для сортировки
        
    for (int i = 0; i < a1.length; i++) {                           // Перебираем 1ый массив и записываем его по порядку в новый
        a3[i] = a1[i];
    }
        
    for (int i = 0, j = a1.length; i < a2.length; i++, j++) {       // Перебираем 2ой массив и записываем его ПОСЛЕ окончания первого
        a3[j] = a2[i];                                              // j = a1.length (отсюда начинаем записывать) пока i < a2.length (Например есть у нас 2 массива с длинной 3 и 6. Создаём массив длинной 9, записываем в него сперва 3 числа, затем оставшиеся 6 уже после трёх записанных.)
    }
        
    for (int i = 0; i < a3.length; i++) {                           // bubleSort - сортировка пузырьком
        for (int j = 1; j < a3.length; j++) {                       // Перебираем массив
            if (a3[j - 1] > a3[j]) {                                // Сравнивая 2 соседних значения ([j-1] и [j])
                min = a3[j];                                        // Далее меньшее из них ставим на позицию j-1 и повторяем всё это циклом
                   a3[j] = a3[j - 1];
                   a3[j - 1] = min;
            }
        }
    }
    return a3;                                                      // Возвращаем готовый отсортированный массив
}