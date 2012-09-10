/**
 * Created with IntelliJ IDEA.
 * User: ashwinko
 * Date: 9/6/12
 * Time: 8:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserInterface {
    public static void main(String [] args){
        LibraryBlore libraryObject=new LibraryBlore();
         String loginType=libraryObject.selectLoginType("user");
        if(loginType.equals("user")){
            UserLibrary userObject=new UserLibrary();
            while (true){
                userObject.showMenuOptions();
                //scanner



            }
        }
        else if(loginType.equals("guest")){
            GuestLibrary guestObject=new GuestLibrary();
            while (true){
                guestObject.showMenuOptions();
            }
        }




    }
}
