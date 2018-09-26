package week2.task3;

public class Task3 {
}

class Cat {
    private String name;
    private int age;
    private String breed;
    private String color;
    
    void setName( String name_ ) {
        this.name = name_;
    }
    
    void setAge( int age_ ) {
        this.age = age_;
    }
    
    void setBreed( String breed_ ) {
        this.breed = breed_;
    }
    
    void setColor( String color_ ) {
        this.color = color_;
    }
    
    String getName() {
        return name;
    }
    
    int getAge() {
        return age;
    }
    
    String getBreed() {
        return breed;
    }
    String getColor() {
        return color;
    }
    
    
    void Meo() {
        System.out.println("meoooo....meoooo....");
    }
    
 
    boolean sameBreed( Cat other ) {
        return this.getBreed().equals(other.getBreed());
    }
    
   
    void ageOfTwoCat( Cat other ) {
        if(this.getAge()> other.getAge()) System.out.println(">");
        else if (this.getAge() < other.getAge()) System.out.println("<");
        else System.out.println("=");
    }
}


class Teacher {
    private String name;
    private int age;
    private String Subject;
    private String married;
    
    void setName( String name_ ) {
        this.name = name_;
    }
    
    void setAge( int age_ ) {
        this.age = age_;
    }
    
    void setSubject( String sub ) {
        this.Subject = sub;
    }
    
    
    String getName() {
        return name;
    }
    
    int getAge() {
        return age;
    }
    
    String getSubject() {
        return Subject;
    }
    
   
    void name() {
        System.out.println("name: "+this.getName());
    }
    
    boolean sameSubject( Teacher other ) {
        return this.getSubject().equals(other.getSubject());
    }
    
}


class Student {
    private String name;
    private int age;
    private String id;
    private String group;
    
    void setName( String name_ ) {
        this.name = name_;
    }
    
    void setAge( int age_ ) {
        this.age = age_;
    }
    
    void setId( String id ) {
        this.id = id;
    }
    
    void setGroup( String group_ ) {
        this.group = group_;
    }
    
    String getName() {
        return name;
    }
    
    int getAge() {
        return age;
    }
    
    String getId() {
        return id;
    }
    
    String getGroup() {
        return group;
    }
    
    
    void printId() {
        System.out.println("id: "+this.getId());
    }
    
   
    void printName() {
        System.out.println("name: "+ this.getName());
    }
    
   
    boolean check( Student other ) {
        return this.getGroup().equals(other.getGroup());
    }
    
    
}