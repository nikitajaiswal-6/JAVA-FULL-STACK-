package org.Assi;

public class WebApplication {

    UserService userS;

    // ise obj baneyga 3 line main and then aur call kar-ga webapp ko
    public WebApplication(UserService userService) {
        this.userS = userService;
        System.out.println("web args constructor");
    }

    public WebApplication() {
        System.out.println("web no args constructor");
    }

    public void setUserService(UserService userService) {
        this.userS = userService;
        System.out.println("setter wep methods called");
    }

    // webapp ke akr 4 line main phla userService ko call krega
    // 6 pe web app methods print krega
   public void webApp()
    {
        userS.userService();
        System.out.println("web app methods called");
    }
}
