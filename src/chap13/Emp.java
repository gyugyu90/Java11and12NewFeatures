package chap13;

import java.util.Objects;

public class Emp {
    private String name;
    private int age;

    public Emp(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if ((!(o instanceof Emp))) return false;
        else {
            if ( ( (Emp)o).getName().equals(this.name) &&
                 ( (Emp)o).getAge() == this.age) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
