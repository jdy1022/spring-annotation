package bean;


/**
 * @author Mr.jdy
 * @create 2020-04-21 9:09
 */
public class Student {
    private String name;
    private Dog dog;

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", dog=").append(dog);
        sb.append('}');
        return sb.toString();
    }
}
