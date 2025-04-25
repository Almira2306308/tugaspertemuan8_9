package No2;

public class Main{
    public static void main(String[] args){
        Person person1 = new Person("Almira", "Cimahi", "081111111111", 
            "almira@mail.com");
        Student student1 = new Student("Rizka", "Bandung", "082222222222", 
            "rizka@mail.com", Student.tahunKedua);
        Employee employee1 = new Employee("Icha", "Palembang", "083333333333", 
            "icha@mail.com", "BUMN", 7000000, new MyDate(2020, 5, 10));
        Faculty faculty1 = new Faculty("Rahma", "Bandung", "084444444444", 
            "rahman@mail.com", "BRIN", 8000000, new MyDate(2018, 3, 21), 
            "08.00-16.00", "Kepala Bagian");
        Staff staff1 = new Staff("Fadhila", "Yogyakarta", "085555555555", 
            "fadhila@mail.com", "BTECH", 4000000, new MyDate(2022, 1, 5), 
            "IT Support");

        System.out.println(person1.toString());
        System.out.println(student1.toString());
        System.out.println(employee1.toString());
        System.out.println(faculty1.toString());
        System.out.println(staff1.toString());
    }
}
