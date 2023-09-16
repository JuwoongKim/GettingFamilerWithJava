package nested_class;

public class Person {

    String name;
    int age;

    class Identification {
        String name;
        String number;

        public Identification(String name, String number) {
            this.name = name;
            this.number = number;
        }

        void printInfo() {
            System.out.println(this.number);
            System.out.println(Person.this.name);
            System.out.println(Person.this.age);
            Person.this.print();

            System.out.println(name);
            System.out.println(age);
            print();
        }

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private void print() {
        System.out.println("Person");
    }

}
