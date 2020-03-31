public class LearningSystem{

    public static void main(String[] args){
        //stage

        Person p1 = new Person("OBrien",32);
        Student s1 = new Student("Daniel",25,3.8);
        Student s2 = new Student("Mark",30,3.76);
        Student s3 = new Student("Chris",29,3.9);

        System.out.println(p1.name+" "+p1.age);
        System.out.println(s1.name+" "+s1.gpa);
        System.out.println(s2.name+" "+s2.gpa);
        System.out.println(s3.name+" "+s2.gpa);
    }
}