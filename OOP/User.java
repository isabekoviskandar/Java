package OOP;

public class User {

    String name;
    int age;
    String email;

    User(String name) {
        this.name = name;
        this.age = 0;
        this.email = "iskandarisabrkov@gmail.com"; // Overoading
    }

    User(String name , int age) {
        this.name = name;
        this.age = 0;
        this.email = "iskandarisabrkov@gmail.com"; // Overoading
    }

    User(String name , int age , String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

}
