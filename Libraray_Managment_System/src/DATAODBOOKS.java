
import java.time.LocalDate;
import java.awt.*;
import java.io.*;
import java.util.*;
import javax.swing.*;


class BookAdding implements Serializable{
    
    String BookID;
    String ename;
    String genre;

    public BookAdding(String BookID, String ename, String genre) {
        this.BookID = BookID;
        this.ename = ename;
        this.genre = genre;
    }
    
    @Override
    public String toString(){
        return "      "+BookID+"\t\t"+ename+"\t\t\t"+genre;
    }  
}

class temp implements Serializable{
    
    String BookID;
    String ename;
    String genre;
    String StudentID;
    String StudentName;
    String  Current_date1;
    String  Return_date1;
    LocalDate  Current_date;
    LocalDate  Return_date;

    public temp(String BookID, String ename, String genre, String StudentID, String StudentName, String Current_date1, String Return_date1, LocalDate  Current_date, LocalDate Return_date) {
        this.BookID = BookID;
        this.ename = ename;
        this.genre = genre;
        this.StudentID = StudentID;
        this.StudentName = StudentName;
        this.Current_date1 = Current_date1;
        this.Return_date1 = Return_date1;
        this.Current_date = Current_date;
        this.Return_date = Return_date;
    }
    
    @Override
    public String toString(){
        return BookID+"\t\t"+ename+"\t\t"+genre+"\t\t"+StudentID+"\t\t"+StudentName+"\t\t"+Current_date1+"\t\t"+Return_date1;
    }     
}


public class DATAODBOOKS extends DataOfMember {
        File file = new File("books.txt");
        File BookIssue = new File("issue.txt");
        LinkedList<BookAdding> a1 = new LinkedList<BookAdding>();
        LinkedList<temp> a2 = new LinkedList<temp>();
        ObjectOutputStream oss1 = null;
        ObjectOutputStream oss2 = null;
        ObjectInputStream osi1 = null;
        ObjectInputStream osi2 = null;
        ListIterator li1 =  null;
        ListIterator li2 =  null;
        public static void main(String[] args) {
            
        
    }
}
