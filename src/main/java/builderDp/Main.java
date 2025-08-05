package builderDp;

public class Main {

    public static void main(String[] args) {

        User user=new User.UserBuilder().setEmail("sb@gmail.com").setUserId("SB0001").setUsername("sankalp").build();
        System.out.println(user);

    }

}
