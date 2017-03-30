
package member;

public class TestLoginMember {
    public static void main(String[] args) {
        LoginMember obj = new LoginMember(111111,"admin");
        obj.checkAdmin();
        System.out.println(obj);
    }
}
