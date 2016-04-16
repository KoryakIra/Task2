package Task2;

import java.util.Date;

/**
 * Created by koryak on 13.04.2016.
 */
public class Student {
   public int id;
    public String surname;
    public String name;
    public String middleName;
    public Date birthdate;
    public String address;
    public String phoneNum;
    public String faculty;
    public int course;
    public  String group;

    public Student() {
    }

    public Student(int id, String surname, String name, String middleName, Date birthdate, String address, String phoneNum, String faculty, int course, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.birthdate = birthdate;
        this.address = address;
        this.phoneNum = phoneNum;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getFaculty() {
        return faculty;
    }

    public int getCourse() {
        return course;
    }

    public String getGroup() {
        return group;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public void list(){
        System.out.print(getId()+")");
        System.out.print(getSurname()+" ");
        System.out.print(getName()+" ");
        System.out.println(getMiddleName());
        System.out.println("Дата рождения: "+getBirthdate().getYear()+"."+getBirthdate().getMonth()+"."+getBirthdate().getDay());
        System.out.println("Адрес: "+getAddress());
        System.out.println("Телефон: "+getPhoneNum());
        System.out.println("Факультет: "+getFaculty());
        System.out.println("Курс: "+getCourse());
        System.out.println("Группа: "+getGroup());
        System.out.println();
    }
    //список студентов заданного факультета
    public void facultet(){
        if ((this.getFaculty()).equals("Физический")){
            System.out.print(getId()+")");
            System.out.print(getSurname()+" ");
            System.out.print(getName()+" ");
            System.out.println(getMiddleName());
            System.out.println("Дата рождения: "+getBirthdate().getYear()+"."+getBirthdate().getMonth()+"."+getBirthdate().getDay());
            System.out.println("Адрес: "+getAddress());
            System.out.println("Телефон: "+getPhoneNum());
            System.out.println("Факультет: "+getFaculty());
            System.out.println("Курс: "+getCourse());
            System.out.println("Группа: "+getGroup());
            System.out.println();
        }
    }
    //список студентов для каждого факультета и курса
    public void faccourse(){
        if(((this.getFaculty()).equals("Исторический"))&&(this.getCourse())==1){
            System.out.print(getId()+")");
            System.out.print(getSurname()+" ");
            System.out.print(getName()+" ");
            System.out.println(getMiddleName());
            System.out.println("Дата рождения: "+getBirthdate().getYear()+"."+getBirthdate().getMonth()+"."+getBirthdate().getDay());
            System.out.println("Адрес: "+getAddress());
            System.out.println("Телефон: "+getPhoneNum());
            System.out.println("Факультет: "+getFaculty());
            System.out.println("Курс: "+getCourse());
            System.out.println("Группа: "+getGroup());
            System.out.println();
        }
    }
    //список студентов, родившехся после заданного года
    public void datebirth(Date p){
        if((this.getBirthdate().getYear())>p.getYear()){
            System.out.print(getId()+")");
            System.out.print(getSurname()+" ");
            System.out.print(getName()+" ");
            System.out.println(getMiddleName());
            System.out.println("Дата рождения: "+getBirthdate().getYear()+"."+getBirthdate().getMonth()+"."+getBirthdate().getDay());
            System.out.println("Адрес: "+getAddress());
            System.out.println("Телефон: "+getPhoneNum());
            System.out.println("Факультет: "+getFaculty());
            System.out.println("Курс: "+getCourse());
            System.out.println("Группа: "+getGroup());
            System.out.println();
        }
    }
    //список учебной группы
    public void grouppp(){
        if((this.getGroup()).equals("Ф41")){
            System.out.print(getId()+")");
            System.out.print(getSurname()+" ");
            System.out.print(getName()+" ");
            System.out.println(getMiddleName());
            System.out.println("Дата рождения: "+getBirthdate().getYear()+"."+getBirthdate().getMonth()+"."+getBirthdate().getDay());
            System.out.println("Адрес: "+getAddress());
            System.out.println("Телефон: "+getPhoneNum());
            System.out.println("Факультет: "+getFaculty());
            System.out.println("Курс: "+getCourse());
            System.out.println("Группа: "+getGroup());
            System.out.println();
        }
    }
}
