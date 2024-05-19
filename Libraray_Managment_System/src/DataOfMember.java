
import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;


class MemberAdding implements Serializable{
    public static void main(String[] args) {
        
    }
    String ID;
    String ename;
    String Department;

    public MemberAdding(String ID, String ename, String Department) {
        this.ID = ID;
        this.ename = ename;
        this.Department = Department;
    }

    
    
    public String toString(){
        return "      "+ID+"\t\t        "+ename+"\t\t\t"+Department;
    }  
}

public class DataOfMember {
    
     File file = new File("member.txt");
        LinkedList<MemberAdding> a = new LinkedList<MemberAdding>();
        ObjectOutputStream oss =null;
        ObjectInputStream osi = null;
        ListIterator li =  null;
}
