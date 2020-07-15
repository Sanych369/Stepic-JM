/*

Напишите метод void print(InputStream inputStream, OutputStream outputStream) который принимает InputStream и OutputStream, считывает все байты из inputStream и записывает в OutputStream только четные.

Пример ввода: 3, 10, 4, 5, 7

Пример вывода: 10, 4

Требования:
1. Метод должен быть публичным.
2. Параметры должны иметь тип InputStream inputStream и OutputStream outputStream.
3. Сигнатура метода должна быть: print(InputStream inputStream, OutputStream outputStream)

*/

public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {  //1 //2 //3
	int buff;
    int result = 0;
        
    while ((buff = inputStream.read()) != -1) {
        if ((result = (byte) buff) % 2 == 0) {
            outputStream.write(result);
        }
    }
    outputStream.flush();
}
