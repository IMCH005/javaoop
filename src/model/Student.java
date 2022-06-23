package model;

/**
 * @Author Kendrick
 * @Mail 1628225498@qq.com
 * @Date 2022/6/23 22:05
 */
public class Student {
    String name;
    Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", IdNo='" + IdNo + '\'' +
                '}';
    }

    public Student(String name, Integer age, String gender, String idNo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        IdNo = idNo;
    }

    String gender;
    String IdNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdNo() {
        return IdNo;
    }

    public void setIdNo(String idNo) {
        IdNo = idNo;
    }

    public static void main(String[] args) {
        System.out.println(new Student("kendrick",22,"男","440883200007084810"));
    }
}
