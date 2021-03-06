/*

Напишите метод printOddNumbers, который принимает массив и выводит в консоль только нечетные числа из него, через запятую. Конец вывода должен перевести курсор на новую строку.

Пример ввода: [3,5,20,8,7,3,100]

Пример вывода: 3,5,7,3

 

Требования:
Сигнатура метода должна быть: printOddNumbers(int[] arr)

*/

public static void printOddNumbers(int[] arr) {
        StringBuilder sb = new StringBuilder();  // Создаём экземпляр StringBuilder'а с именем sb
        
        for (int i : arr) {                      // Перебираем полученный массив в переменной i (for each)
            if (i % 2 == 1 || i % 2 == -1) {     // Если число в массиве делится на 2 без остатка(как положительное так и отрицательное)
                sb.append(i).append(",");        // Записываем это число методом append в наш StringBuilder и добавляем "запятую"(как на примере)
            }
        }
        sb.setLength(sb.length() - 1);           // Убираем последнюю запятую
        sb.append("\n");                         // Переводим на новую строку
        System.out.print(sb);                    // Выводим в консоль
}
