public class This {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.getAge(32);
        human1.getName("Janybek");
//        System.out.println(human1.getAge(32));
//        System.out.println(human1.getName("Janybek"));
        human1.getInfo();
        human1.lastName = "Orozbekov";
        System.out.println(human1.getLastName());
    }
}

class Human{
     private int age;
     private String name;
     String lastName;
    public void getAge(int age ) {this.age = age;}
    public void getName(String name) {this.name = name;}
    public void getInfo() {System.out.println(age + ", " + name);}

    public String getLastName() {
        return lastName;
    }
}
