public class Classes {
    public static void main(String[] args) {
//        System.out.println("hello ");
        Person p1 = new Person();
        p1.name = "my baby";
        p1.age = 21;
        Person p2 = new Person();
        p2.name = "Nobody";
        p2.age = 24;
        System.out.println( p2.name + " " +  p2.calculate() + " years old");
        p1.sayHello();
        p2.speak();
    }
}
class Person {
    int age;
    String name;
    void speak() {
        for (int i = 0;i < 3; i++) {
            System.out.println("I love you my " + name  );
        }
    }
    void sayHello () {
        System.out.println("I am " + name + " " + "i am " + age);
    }
      int calculate(){
        int year = 65;
         int newNum = year -age;

            return newNum - age;
     }

}