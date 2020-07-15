/*

Напишите программу, которая прочитает из System.in последовательность целых чисел, разделенных пробелами, затем удалит из них все числа, стоящие на четных позициях, и затем выведет получившуюся последовательность в обратном порядке в System.out.

Все числа влезают в int. Позиции чисел в последовательности нумеруются с нуля.

Все import объявлены за вас.

Пример ввода: 1 2 3 4 5 6 7 8 9 10
Пример вывода: 10 8 6 4 2
 
Требования:
1. Необходимо наличие метода public static void main(String[] args)
2. Программа должна читать данные из консоли
3. Программа должна выводить текст в консоль

*/

public static void main(String[] args) {  //1. Необходимо наличие метода public static void main(String[] args)
    Scanner scanner = new Scanner(System.in);
    Deque<Integer> deque = new ArrayDeque<>();
    
    String[] line = scanner.nextLine().split(" ");
    
    for (int i = 0; i < line.length; i++) {
        if ((i & 1) != 0) {
            deque.add(Integer.valueOf(line[i]));  //2. Программа должна читать данные из консоли
        }
    }

    for (int i = deque.size(); i > 0; --i) {
        System.out.print(deque.removeLast() + " ");  //3. Программа должна выводить текст в консоль
    }
}
