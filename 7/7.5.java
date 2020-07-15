/*

Напишите метод, находящий в стриме минимальный и максимальный элементы в соответствии порядком, заданным Comparator'ом.

Найденные минимальный и максимальный элементы передайте в minMaxConsumer следующим образом:

minMaxConsumer.accept(min, max);
Если стрим не содержит элементов, то вызовите:

minMaxConsumer.accept(null, null);
Требования:
1. Должен быть метод public <T> void findMinMax(Stream<? extends T> stream, Comparator<? super T> order, BiConsumer<? super T, ? super T> minMaxConsumer)
2. Метод должен находить минимум и максимум в потоке, с помощью order.
3. Полученные данные должны быть записаны minMaxConsumer, согласно условию

*/

public static <T> void findMinMax(
    Stream<? extends T> stream,
    Comparator<? super T> order,
    BiConsumer<? super T, ? super T> minMaxConsumer) {
    List<T> sortedList = stream.sorted(order).collect(Collectors.toList());
    
    if (sortedList.isEmpty()) {
        minMaxConsumer.accept(null, null);
    } else {
        minMaxConsumer.accept(sortedList.get(0), sortedList.get(sortedList.size() - 1));
    }
}
