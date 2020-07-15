/*

Напишите метод int sumOfStream(InputStream inputStream), который принимает InputStream и возвращает сумму всех его элементов.

Пример ввода: 1, 2, 4, 10

Пример вывода: 17

Требования:
1. Метод должен быть публичным.
2. Параметр должен иметь тип InputStream.
3. Сигнатура метода должна быть: sumOfStream(InputStream inputStream)

*/

public int sumOfStream(InputStream inputStream) throws IOException {  //1. Метод должен быть публичным. //2. Параметр должен иметь тип InputStream. //3. Сигнатура метода должна быть: sumOfStream(InputStream inputStream)
	int buff;
    int result = 0;
 
    while ((buff = inputStream.read()) != -1) {
        result += (byte) buff;
    }
    return result;
}
