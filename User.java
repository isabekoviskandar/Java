public class User {
    String username;
    String email;
    int age;

    User( String username){
        this.username = username;
        this.email = "Not";
        this.age = 10;

    }
    User(String username , String email){
        this.username = username;
        this.email = email;
        this.age = 19;
    }

    User(String username , String email , int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }

}
