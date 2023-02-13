package person;

public class Person {
    private final String fullName="Dastanbek";
    private static int age;


    public String getFullName() {
        return fullName;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void work(){
        System.out.println(" Человек работает");

    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + fullName + '\'' +
                ",Age='" + getAge() + '\'' +
                '}';
    }
}
