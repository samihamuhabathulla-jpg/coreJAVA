package innerclass;

class Person {

    int age = 21;
    static int weight = 45;
    static class Gender {

        void nonStaticDisplay() {
            System.out.println("In NonStatic Display Method");
            System.out.println("Weight Value: " + weight);
        }

        static void staticDisplay() {
            System.out.println("In Static Display Method");
            System.out.println("Weight Value: " + weight);
        }
    }
}


public class StaticNestedClass {

    public static void main(String[] args) {

        Person.Gender gender = new Person.Gender();

        gender.nonStaticDisplay();
        Person.Gender.staticDisplay();
    }
}