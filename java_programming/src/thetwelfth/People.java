package thetwelfth;

class People {
    String name;
    int age;

    People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return ("name : " + this.name + ", age : " + this.age);
    }
}