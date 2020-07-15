/*

Магазину нужно сохранять информацию о продажах для каждого сотрудника. Напишите метод Map getSalesMap(Reader reader) который принимает Reader содержащий строки вида:

Алексей 3000
Дмитрий 9000
Антон 3000
Алексей 7000
Антон 8000
Метод должен получить все строки из Readera и заполнить и вернуть карту где ключом будет имя сотрудника, а значением сумма всех его продаж.

Пример ввода:
 

Алексей 3000
Дмитрий 9000
Антон 3000
Алексей 7000
Антон 8000
Пример вывода:
{Алексей=[10000], Дмитрий=[9000], Антон=[11000]}
 
Требования:
1. Должен быть метод public static Map<String, Long> getSalesMap(Reader reader)
2. Работа метода getSalesMap должна удовлетворять условию

*/

public static Map<String, Long> getSalesMap(Reader reader) throws IOException {
    Map<String, Long> map = new HashMap<>();
    BufferedReader br = new BufferedReader(reader);
    String name, line;
    long sum1;

    while ((line = br.readLine()) != null) {
        name = line.trim().split(" ")[0];
        sum1 = Long.parseLong(line.trim().split(" ")[1]);
        map.merge(name, sum1, Long::sum);
    } br.close();
    return map;
}
