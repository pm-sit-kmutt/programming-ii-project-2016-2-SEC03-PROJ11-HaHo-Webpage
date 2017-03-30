
package member;

public class RegisterMember {
    private static long count = 590000;
    private long userId;
    private String password;
    private String checkUser;
    private String checkAdmin;

    public RegisterMember() {
        count++;
        this.userId = count;
    }

    public static long genUserId(){
        return count;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "Member{" + "userId=" + userId + ", password=" + password  + '}';
    } 
}
    

