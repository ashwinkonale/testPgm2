/**
 * Created with IntelliJ IDEA.
 * User: SONY
 * Date: 8/23/12
 * Time: 2:17 PM
 * To change this template use File | Settings | File Templates.
 */
public class UserDetails {
    private int userId;
    private String password;

    public UserDetails(int i, String s) {
        this.userId=i;
        this.password=s;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
