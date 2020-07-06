package bean;


/**
 * @author Mr.jdy
 * @create 2020-04-16 11:20
 */
public class Dog  implements Runnable{
    /**
     * 姓名
     */
    private String name;
    /**
     * 品种
     */
    private String kinds;

    /**
     * 年龄
     */
    private String age;

    /**
     * 初始化
     */
    public void init_method(){
        System.out.println("3.初始化方法init_method.....");
    }

    public Dog(String name, String kinds, String age) {
        this.name = name;
        this.kinds = kinds;
        this.age = age;
    }

    /**
     * 销毁 ：单例下能关闭，多例下不能
     */
    public void destory_method(){
        System.out.println("4.销毁方法destory_method.....");
    }

    public Dog() {
        System.out.println("1.构造器初始化开始。。。。。。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("2.为bean的属性设置值" + name);
        this.name = name;
    }

    public String getKinds() {
        return kinds;
    }

    public void setKinds(String kinds) {
        this.kinds = kinds;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", kinds='" + kinds + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public void run() {

    }
}
