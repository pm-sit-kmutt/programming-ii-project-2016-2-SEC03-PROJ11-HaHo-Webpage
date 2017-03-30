
package member;

public class LoginMember {
    private long userId;
    private String password;
    private RegisterMember member;
    private String checkUser;
    private String checkAdmin;

    public LoginMember(long userId, String password) {
        this.userId = userId;
        this.password = password;
    }
    
    public String checkMember(){//ยังทำงานไม่ได้ ต้องแก้ method นี้
        if(password.equalsIgnoreCase(member.getPassword()) && userId == (member.getUserId()) )
            checkUser = "User login Success";		
	else
            checkUser = "The userId or The password you entered is not valid.";
        
        return checkUser;
    }
     
     public String checkAdmin(){
           if("admin".equalsIgnoreCase(this.password) && 111111 == (this.userId) )
            checkAdmin = "Admin login Success";		
	else
            checkAdmin = "The userId or The password you entered is not valid.";
        
        return checkAdmin;
    }

    @Override
    public String toString() {
        return "LoginMember{" + "checkUser=" + checkUser + ", checkAdmin=" + checkAdmin + '}';
    }
}
