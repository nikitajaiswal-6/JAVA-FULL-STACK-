import java.util.HashMap;
import java.util.Map;

public class UserServices {

    private Map<String,User> userMap=new HashMap<>();

    private User currentuser=null;


    public  boolean RegisterUser(String username,String FullName,String password,String Age,String Gender,String contact,String email)
    {
        if (userMap.containsKey(username)){
            System.out.println("User already exists! To register Choose another name!!");
            return false;
        }

//        User user=new User(username,FullName,password,Age,Gender,contact,email);
        User user=new User(username,password,FullName,Age,Gender,contact,email); // right
        userMap.put(username,user);
        System.out.println("  You are Successfully Registered ☻ ");

        LoginUser(username,password);
        return true;
    }

    public boolean LoginUser(String username,String password)
    {
        if (!userMap.containsKey(username))
        {
            System.out.println("user name not exits");
            return false;
        }
        User user=userMap.get(username);
        if (!user.getPassword().equalsIgnoreCase(password))
        {
            System.out.println("Invalid password ");
        }
        currentuser=user;
        System.out.println("|<-------------Login------------->|");
        System.out.println("|<------------>"+currentuser.getFullName()+"<------------>|");
        System.out.println("|<------------------------------->|");
        return true;
    }

    public void LogoutUser(){

        if (currentuser!=null){
            System.out.println("Logged out"+currentuser.getFullName());
        }

        currentuser=null;
    }

    public User CurrentUser(){
        return currentuser;
    }

    public boolean LoggIn(){
        return currentuser!=null;
    }



}
