/**
 * Created with IntelliJ IDEA.
 * User: SONY
 * Date: 8/16/12
 * Time: 10:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class myBook {
    protected String bookName;
    public myBook(String bookName){
        this.bookName=bookName;
    }

    public String toString() {
        return bookName;
    }

    public String getBookName() {
        return bookName;
    }
}
