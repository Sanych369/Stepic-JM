/*

Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.

Метод getCallerClassAndMethodName() должен возвращать имя класса и метода, откуда вызван метод, вызвавший данный утилитный метод. Или null (нулевую ссылку, а не строку "null"), если метод, вызвавший getCallerClassAndMethodName() является точкой входа в программу, т.е. его никто не вызывал.

Это актуально, например, в библиотеках логирования, где для каждого сообщения в логе надо выводить класс и метод, откуда сообщение было залогировано.

P.S. При тестировании этой программы в среде разработки вы можете получить другой результат: вместо null в первой строчке будет напечатан какой-то посторонний класс и метод. Это связано с тем, что среда разработки обычно запускает не ваш класс, а свой собственный, который затем уже вызывает ваш. Чтобы этого избежать, запускайте программу командой "java" в командной строке.

P.P.S. Эта задача в уроке про исключения не случайно :)

*/

public static String getCallerClassAndMethodName() {
    StackTraceElement[] methods = new Throwable().getStackTrace();
        
    if (methods.length < 3) {
        return null;
    } else {
        return methods[2].getClassName().concat("#").concat(methods[2].getMethodName());
    }
}
