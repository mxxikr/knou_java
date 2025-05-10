package thetwelfth;

public class Member {
    private String name;
    private String gender;
    private int age;

    // 생성자
    public Member(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // Getter 메서드
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    // Setter 메서드
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{name='" + name + "', gender='" + gender + "', age=" + age + '}';
    }
}