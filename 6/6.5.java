/*

Реализуйте метод symmetricDifference, вычисляющий симметрическую разность двух множеств. Метод должен возвращать результат в виде нового множества. Изменять переданные в него множества не допускается.

Пример ввода: [1, 2, 3} и {0, 1, 2]
Пример вывода: [0, 3]
 
Требования:
1. должен быть метод public static Set symmetricDifference(Set set1, Set set2)
2. метод symmetricDifference не должен изменять исходные множества
3. метод symmetricDifference должен возвращать корректный результат

*/

public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
    Set hs1 = new HashSet(set1);
    Set hs2 = new HashSet(set2);
    hs1.removeAll(set2);
    hs2.removeAll(set1);
    hs1.addAll(hs2);
    return hs1;
}
