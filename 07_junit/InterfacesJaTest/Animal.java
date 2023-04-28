package InterfacesJaTest;

public class Animal implements Info {

    public int age;
    public String name;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }
    public void sleep() {
        System.out.println("I am sleeping: Zzz...");
    }

    public void showInfo(){
        System.out.println("Age is "+ this.age);
    }
}
