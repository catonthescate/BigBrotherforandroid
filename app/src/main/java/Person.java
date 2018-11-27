public class Person {
    String name;
    String sex;
    String relation;
    int age;
    int avatar;

    public Person(String name, String sex, String relation, int age, int avatar){
        this.name = name;
        this.sex = sex;
        this.relation = relation;
        this.age = age;
        this.avatar = avatar;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getRelation() {
        return relation;
    }

    public String getSex() {
        return sex;
    }
}
