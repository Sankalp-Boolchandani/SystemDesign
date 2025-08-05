package builderDp;

public class User {

    private final String username;
    private final String userId;
    private final String email;

    private User(UserBuilder userBuilder){
        this.userId= userBuilder.userId;
        this.email= userBuilder.email;
        this.username= userBuilder.username;
    }

    public String getUsername() {
        return username;
    }

    public String getUserId() {
        return userId;
    }

    public String getEmail() {
        return email;
    }

    public static class UserBuilder{

        private String username;
        private String userId;
        private String email;

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

}

//    builder design pattern includes creating a builder class inside or not inside the main class.
//    Used to overcome factory design pattern limitation when a class has many variables.

//    Builder DP includes having a subclass or another class which has a build method.
//    that calls the constructor of the main class.
//    All the setters of the subclass return the object of a subclass itself method chaining to work and builder is implemented.
//    Inside the constructor of the main class, the variables are given the values coming from builder class object.
