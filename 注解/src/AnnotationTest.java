/**
 * 注解的使用
 *
 * @author xujiale
 * @date 2021/8/24 13:48
 */

public class AnnotationTest {
    public static void main(String[] args) {
        Person person = new Student();
        person.walk();
    }
}

class Person {
    private String name;
    private int age;

    public Person(){ }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void walk(){
        System.out.println("walk");
    }

    public void eat(){
        System.out.println("eat");
    }
}

class Student extends Person {

    @Override
    public void walk() {
        System.out.println("student walk");
    }
}