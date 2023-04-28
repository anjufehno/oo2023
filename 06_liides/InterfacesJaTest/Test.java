package InterfacesJaTest;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Liza", 1);
        Person person1 = new Person("Biba");
        animal1.sleep();
        animal1.showInfo();
        person1.sayHello();
        person1.showInfo();


        /*
        Info info1 = new Animal(1);
        Info info2 = new Person("Biba");
        info1.showInfo(); // Доступ идёт только к метода интерфейса Info, доступа до остальных таких как sleep их нет
        info2.showInfo();
        /* Как можно заметить, мы ссылаемся переменной типа Info на объекты класса Animal и Person, мы можем так делать потому что класс
        Animal и класс Person, реализует интерфейс Info
         */
    }
}
