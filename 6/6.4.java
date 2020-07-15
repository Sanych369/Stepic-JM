/*

Массивы в Java имеют фиксированную длину. Попробуем обойти это ограничение. Создайте класс DynamicArray, который хранит в себе массив, и имеет методы для добавления void add(T el), void remove(int index) удаления и извлечения T get(int index) из него элементов, при переполнении текущего массива, должен создаваться новый, большего размера.

Для возможности работы с различными классами DynamicArray должен быть дженериком. Для решения задачи можно воспользоваться методами из класса java.util.Arrays. Импорт этого класса уже объявлен в тестирующей системе. Добавлять его явно не нужно

Требования:
1. должен быть класс public static class DynamicArray
2. класс DynamicArray должен иметь методы публичные void add(T el), void remove(int index) и T get(int index)
3. класс DynamicArray должен  иметь публичный конструктор по умолчанию
3. работа методов должна соответствовать условию

*/

public static class DynamicArray<T> {  //1. должен быть класс public static class DynamicArray
    private int size;
    private Object[] array;

    public DynamicArray() {     //3. класс DynamicArray должен  иметь публичный конструктор по умолчанию
        size = 0;
        array = new Object[10];
    }

    public void add(T el) {           //2. класс DynamicArray должен иметь методы публичные void add(T el)
        try {
            if (size == array.length) {
                array = Arrays.copyOf(array, array.length + (array.length / 2));
            }
        } catch (NegativeArraySizeException | NullPointerException e) {
            System.out.println(e);
        }
        array[size] = el;
        size++;
    }

    public void remove(int index) {   //2. класс DynamicArray должен иметь методы публичные void remove(int index)
        try {
            System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
        } catch (IndexOutOfBoundsException | ArrayStoreException | NullPointerException e) {
            System.out.println(e);
        }

    }

    public T get(int index) {        //2. класс DynamicArray должен иметь методы публичные T get(int index)
        if (array.length - 1 >= index && index >= 0) {
            return (T) this.array[index];
        } else {
            return (T) this.array[-1];
        }
    }
}
