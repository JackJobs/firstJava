package api.mengkang.net.entity;

public class User {
    private Integer id;
    private Integer age;
    private Integer sex;
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User() {

    }

    public User(Integer id, Integer age, Integer sex, String username) {
        this.id = id;
        this.age = age;
        this.sex = sex;
        this.username = username;
    }
}
