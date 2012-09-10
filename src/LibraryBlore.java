import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: SONY
 * Date: 8/16/12
 * Time: 9:33 AM
 * To change this template use File | Settings | File Templates.
 */
public class LibraryBlore {

    public ArrayList<Movie>MovieList=new ArrayList<Movie>();

    protected int MAX_NUM_BOOKS=5;
    private int MAX_NUM_MOVIES=5;
    private String bookName;
    protected String loginType;
    public myBook [] booksInLibrary=new myBook[MAX_NUM_BOOKS];

    public void showWelcomeMsg() {
        System.out.println("WelcomeToLibrary");
    }

    public void showMenuOptions() {
        System.out.println("Select your choice");
        System.out.println("1: View Books ");
        //System.out.println("2: Reserve Book ");
        System.out.println("2: View movies ");
        //System.out.println("4: check membership status");
        System.out.println("3: Exit ");

       /* Scanner reader = new Scanner(System.in);
        String userWish = reader.nextLine();

        switch (userWish){

        }*/


    }
    public LibraryBlore(){
        addBooks();
        addMovies();

    }



    private void addMovies() {
        for(int i=0;i<MAX_NUM_MOVIES;i++){
            MovieList.add(new Movie("movie"+i,"director"+i,Math.random()*10));
        }
    }

    private void addBooks() {
        for(int i=0;i<MAX_NUM_BOOKS;i++){
            booksInLibrary[i]=new myBook("book"+i);
        }
    }

    public void showBookList() {

        for(int i = 0;i<MAX_NUM_BOOKS;i++){
            System.out.println(booksInLibrary[i]);
        }
    }

    public void viewMovieList() {
        for(int i=0;i<MovieList.size();i++){
           System.out.println(MovieList.get(i));
        }
        //To change body of created methods use File | Settings | File Templates.
    }
    public boolean equals(Object object){
        myBook mybook =(myBook)object;
        return bookName==mybook.bookName;
    }
    void reserveBook(String book1){}

    public String selectLoginType(String loginOption) {
        System.out.println("Select your login type");
        System.out.println("1--> USER");
        System.out.println("2--> GUEST");
        if(loginOption.equals("user")){
            //System.out.println("thank you , u are logged in as User!");
            loginType=loginOption;
            //testAuthentication();

        }
        else {
            System.out.println("Thank you , u are logged in as guest!");
            loginType=loginOption;
            // showMenuOptions(loginType);

        }

        return loginOption;  //To change body of created methods use File | Settings | File Templates.
    }



}

