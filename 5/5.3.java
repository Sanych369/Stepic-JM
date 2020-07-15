/*

Реализуйте метод, который зачитает данные из InputStream и преобразует их в строку, используя заданную кодировку.

Пример:
InputStream последовательно возвращает четыре байта: 48 49 50 51.
Метод, вызванный для такого InputStream и кодировки ASCII, должен вернуть строку: "0123".

Требования:
1. Метод должен быть публичным.
2. Сигнатура метода должна быть: readAsString(InputStream inputStream, Charset charset)

*/

public static String readAsString(InputStream inputStream, Charset charset) throws IOException {  //1 //2
    String str;
    int x;
    
    Reader reader = new InputStreamReader(inputStream, charset);
    StringWriter sw = new StringWriter();
    
    while ((x = reader.read()) != -1) {
        sw.write(x);
    }
    str = sw.toString();
    return str;
}
