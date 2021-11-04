import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private int age;



    public Person(String inName, int inAge) {
        name = inName;
        age = inAge;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }


   @Override
    public String toString() {
        return name + ", " + age;
    }
}
