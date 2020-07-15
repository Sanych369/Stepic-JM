/* 
Создайте класс Human с полями возраст (age), имя (name), фамилия (secondName) и любимый вид спорта (favoriteSport).

Создайте 3 конструктора в классе Human, 1-ый - пустой, 2-ой, который конструирует Human’a от всех полей и третий, который конструирует Human’a, от всех полей, кроме любимого вида спорта. Для успешного тестирования решения важно объявлять аргументы в конструкторах именно в том порядке, в котором они написаны в данном описании (возраст (age), имя (name), фамилия (secondName) и любимый вид спорта (favoriteSport))

В методе main создайте 3 экземпляра человека используя 3 этих разных конструктора. поля класса должны иметь размерность, не превышающую необходимую. Класс должен быть объявлен статическим, метод main не должен находиться в классе, поля класса должны иметь доступ только внутри класса

Требования:
1. Должен быть метод public static void main(String[] args)
2. Должен быть public static class Human
3. У класс Human должны быть поля
4. Класс Human должен иметь 3 конструктора
5. В методе main нужно создать три объекта класса Human тремя способами

*/

public static void main(String[] args) {                                     //1. Должен быть метод public static void main(String[] args)
        Human human1 = new Human();                                          //5. В методе main нужно создать три объекта класса Human тремя способами(1)
        Human human2 = new Human((byte)12,"Alexey","Vladykin");              //5. В методе main нужно создать три объекта класса Human тремя способами(2)
        Human human3 = new Human((byte)27,"Andrey","Trofimov","Football");   //5. В методе main нужно создать три объекта класса Human тремя способами(3)
}

public static class Human {              //2. Должен быть public static class Human
    private byte age;                    //3. У класс Human должны быть поля(1)
    private String name;                 //3. У класс Human должны быть поля(2)
    private String secondName;           //3. У класс Human должны быть поля(3)
    private String favoriteSport;        //3. У класс Human должны быть поля(4)

    public Human() {}                    //4. Класс Human должен иметь 3 конструктора(1)

    public Human(byte age, String name, String secondName, String favoriteSport) {    //4. Класс Human должен иметь 3 конструктора(2)
        this(age, name, secondName);
        this.favoriteSport = favoriteSport;
    }

    public Human(byte age, String name, String secondName) {                          //4. Класс Human должен иметь 3 конструктора(3)
        this.age = age;
        this.name = name;
        this.secondName = secondName;
    }
}
