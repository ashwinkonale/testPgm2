import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: SONY
 * Date: 8/12/12
 * Time: 2:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class test {


    @Test
    public void testLibrarianMsg(){
        LibraryBlore showMsg=new UserLibrary();
        showMsg.showWelcomeMsg();

    }
    @Test
    public void testShowMenuOptions(){
        LibraryBlore showOptions = new GuestLibrary();
        showOptions.showMenuOptions();
    }
    @Test
    public void testViewBooks(){
        LibraryBlore viewBooks = new GuestLibrary();
        viewBooks.showBookList();
    }
    @Test
    public void testReserveBook(){
        LibraryBlore resBooks=new UserLibrary();
        //String book1 = null;
        resBooks.reserveBook("book5");
        resBooks.showBookList();
        //myBook newBook=resBooks.booksInLibrary.get(1);
        //assertFalse(resBooks.booksInLibrary.contains(newBook));
    }



    @Test
    public void testShowLibrarianMsg(){
        UserLibrary showMsg=new UserLibrary();
        showMsg.showLibrarianMsg();
    }
    /*@Test
    public void testViewMovies(){
        LibraryBlore viewMovies=new LibraryBlore();
        viewMovies.viewMovieList();

    }*/
    @Test
    public void testLoginType(){
        UserLibrary testLogin= new UserLibrary();
        testLogin.selectLoginType("user");
    }
    @Test
    public void testAuthentication(){
        UserLibrary promptAuthentication= new UserLibrary();
        assertTrue(promptAuthentication.testAuthentication(111, "password111"));
        assertFalse(promptAuthentication.testAuthentication(111, "password123"));
    }
    /*@Test
    public void testShowUserList(){
        LibraryBlore lol=new LibraryBlore();
        lol.showuserlist();
    } */







}
