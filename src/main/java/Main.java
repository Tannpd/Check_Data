
import Common.Library;


public class Main{
    Library l;
    
    public Main() {
        l = new Library();
    }
     public static void main(String[] args) {
        Main program = new Main();
        program.Input();
    }
    
    public void Input(){
        System.out.print("Phone number: ");
        String phone = l.checkInputPhone();
        System.out.print("Date: ");
        String date = l.checkInputDate();
        System.out.print("Email: ");
        String email = l.checkInputEmail();
    }
    
    
}
