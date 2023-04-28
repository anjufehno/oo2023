package InterfacesJaTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void getAnimalNameMethod() {
        Animal animal2 = new Animal("Sasha ", 2);
        assertEquals("Sasha", animal2.getName());
    }

    @Test
    public void setName() {
    }

    @Test
    public void getAge() {
        Animal animal3 = new Animal("Sasha ", 5);
        assertEquals(3, animal3.getAge());
    }

    @Test
    public void setAge() {
    }

    @Test
    public void sleep() {
    }

    @Test
    public void showInfo() {
    }
}