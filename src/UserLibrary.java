import java.util.ArrayList;

/**
* Created with IntelliJ IDEA.
* User: SONY
* Date: 8/23/12
* Time: 10:56 PM
* To change this template use File | Settings | File Templates.
*/
public class UserLibrary extends LibraryBlore {
    public ArrayList<UserDetails> userList=new ArrayList<UserDetails>();

    public UserLibrary() {
        addUserDetails();
    }

    private void addUserDetails() {
                for (int i=111;i<119;i++){
                userList.add(new UserDetails(i,"password"+i));
           }
    }


    public void reserveBook(String bookname) {
        System.out.println("Select the book to be reserved");
        //Scanner reader=new Scanner(System.in);
        //String bookname=reader.nextLine();
        boolean availability=false;
        for (int  i = 0 ; i < MAX_NUM_BOOKS; i++){
            if(bookname.equals(booksInLibrary[i].getBookName())){
                availability=true;
                booksInLibrary[i]=null;
                break;
            }
            availability=false;

        }

        if(availability){
            System.out.println("Congratulation!! You Have Reserved the Book named -->" +bookname);

        }
        else if (availability==false) {
            System.out.println("Sorry!! "+ bookname + " is not currently available");
        }


    }
    public void showLibrarianMsg() {
        System.out.println("Your ID number is  ");
        //System.exit(0);

    }
    public boolean testAuthentication(int userId,String password) {
        System.out.println("UserName : ");
        System.out.println("Password : ");
        boolean authenticationPassed=false;
        for (int i=0;i<userList.size();i++){
            UserDetails user_temp=userList.get(i);

            if(userId==user_temp.getUserId()&&password.equals(user_temp.getPassword())){
                authenticationPassed=true;
                System.out.println("Authentication successful! You are logged in with user Id__> " +user_temp.getUserId()
                );
                break;
            }
            else {
                authenticationPassed=false;
                System.out.println("Authentication failed! incorrect username or password");
                break;
            }
        }


        return authenticationPassed;
    }


}
