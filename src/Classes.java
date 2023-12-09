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
        Person p3 = new Person();
        p3.string("janybek");
        System.out.println(p3.number(23));
        Person lastName = new Person();
        lastName.lastName("");
        Person getHouse = new Person();

        int house = getHouse.getHouse(13);

        if (house == 0){
            System.out.println("Ввевите число ");
        } else { System.out.println(house);}
    }
}
class Person {
    int age;
    String name;
    private int house;
    private String lastName;
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
     void string (String userName ) {
//        name = userName;
         System.out.println(name = userName);
     }
     int number (int number) {
        return age = number;
     }
     public void  lastName (String userName) {
        if (userName.isEmpty()) {
            System.out.println("Введите имя");
        }
        else {
            String name = lastName = userName;
            System.out.println(name);
        }
     }

    public int getHouse(int number ) {
        if (number == 0) {
            return  0;
        }
        else {
            return house = number;
        }
    }
}