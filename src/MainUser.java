import controller.UserController;

public class MainUser {
    public static void main(String[] args) {
        UserController uc = new UserController();
        uc.addUser("mkkkkkk", "mkkkkkkk");
        uc.addUser("kk", "kk");
        uc.addUser("xxx", "xxx");
        uc.addUser("mk", "mk");
        uc.deleteUser("mk");
        uc.deleteUser("ssss");

        uc.showUsers();

        uc.changePassword(
                "kk",
                "kk",
                "KaNNibal6",
                "KaNNibal6");
        uc.changePassword(
                "kk",
                "kk",
                "nowe1",
                "nowe");

    }
}
