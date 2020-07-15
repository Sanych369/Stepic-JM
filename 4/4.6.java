/*

Создайте в статичном публичном методе logging логгер с именем com.javamentor.logging.Test, залогируйте им два сообщения: первое "Все хорошо" с уровнем INFO и второе "Произошла ошибка" с уровнем WARNING.

java.util.logging.* импортирован за вас

*/

public static void logging () {
    final Logger logger = Logger.getLogger("com.javamentor.logging.Test");
    logger.info("Все хорошо");
    logger.warning("Произошла ошибка");
}
