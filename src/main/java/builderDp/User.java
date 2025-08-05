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
