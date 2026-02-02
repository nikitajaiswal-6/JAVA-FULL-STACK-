package org.Assi;

public class UserService {


    UserController userController;

    public UserService(UserController userController) {
        this.userController = userController;
        System.out.println("user service args constructor");
    }

    // first obj bayega iss
    public UserService() {
        System.out.println(" user no args constructor");
    }

    // and dependency add kre ga ispe then call karega web ka constructor
    public void setUserController(UserController userController) {
        this.userController = userController;
        System.out.println("setter user service methods called");
    }

    // 4 line main web app se ispe call ayegi then ye calla krega userController ko
    // 5 line main user service call ho jayega
    void userService()
    {
        userController.userController();
        System.out.println("user service call...");
    }
}
