import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.ListIterator;


class AccountAdding implements Serializable{
    
    String username;
    String password;

    public AccountAdding(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    
    
    @Override
    public String toString(){
        return username+"\t\t"+password;
    }  
}


public class DataOfLogin extends DataOfMember {
        File fileOflogin = new File("Account.txt");
        LinkedList<AccountAdding> loginLinkList = new LinkedList<AccountAdding>();
        ObjectOutputStream oss5 = null;
        ObjectInputStream osi5 = null;
        ListIterator li5 =  null;
        public static void main(String[] args) {
        
    }
}
