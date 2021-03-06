package paixu;

public class Student implements Comparable<Student> {

	private String name;
    private Integer age;

    public Student(String name,Integer age) {
        this.name=name;
        this.age=age;
    }

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

    public int compareTo(Student o) {
        if(this.age>o.getAge()){
            return -1;
        }
        else if(this.age<o.getAge()){
            return 1;
        }
        else{
            return 0;
        }
    }
    public Student(){}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
    
}
