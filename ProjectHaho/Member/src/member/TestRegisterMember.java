
package member;

public class TestRegisterMember {
    public static void main(String[] args) {
        RegisterMember[] obj = new RegisterMember[3];
               obj[0] = new RegisterMember();
               obj[0].setPassword("nam123");
               
               obj[1] = new RegisterMember();
               obj[1].setPassword("123456");
               
               obj[2] = new RegisterMember();
               obj[2].setPassword("nn1234");
               
               for(int i = 0;i<obj.length;i++){
                   System.out.println(obj[i]);
               }
        
    }
}
