public class book{

    int bookID;
    String bookName;
    boolean bookStatus;             //  ** ask to make boolean


    public book( int bkid, String name ){       //  purposefully left out bookStatus, as 

        bookID = bkid;
        bookName = name;
        bookStatus = true;

    }

    ///////////////////////////////////////////////

    public int getBookID(){
        return bookID;
    }

    public String getBookName(){
        return bookName;
    }

    public boolean getBookStatus(){
        return bookStatus;
    }

    //////////////////////////////////////////////

    public void setBookID(int a){
        bookID = a;
    }

    public void setBookName(String a){
        bookName = a;
    }

    public void setBookStatus(boolean a){
        bookStatus = a;
    }



















}