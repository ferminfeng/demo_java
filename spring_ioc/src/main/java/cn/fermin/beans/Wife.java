package cn.fermin.beans;

public class Wife {
    private Integer age;
    private String name;

    public Wife(){
        System.out.println("wife已加载");
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
