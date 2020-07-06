package bean;

import java.util.List;
import java.util.Map;

/**
 * @author Mr.jdy
 * @create 2020-04-20 17:22
 */
public class Person {
    private String name;
    private int age;

    private List<Dog> dogs;

    private Map<String,Car> cars;

    public Person() {
        System.out.println("person的无参构造器");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initMethod(){
        System.out.println("初始化方法");
    }

    public void destoryMethod(){
        System.out.println("销毁方法");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("person的set方法");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }

    public Map<String, Car> getCars() {
        return cars;
    }

    public void setCars(Map<String, Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", dogs=").append(dogs);
        sb.append(", cars=").append(cars);
        sb.append('}');
        return sb.toString();
    }
}
