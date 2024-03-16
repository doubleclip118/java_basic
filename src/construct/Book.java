package construct;

public class Book {
    String title;
    String author;
    int page;
    Book(String title,String author){
        this(title,author,0);
    }
    Book(String title,String author, int page){
        this.title = title;
        this.author = author;
        this.page = page;
    }
    Book(){}

    void displayInfo(){
        System.out.println("타이틀 = " + title+"작가 = "+author+"페이지 = "+page);
    }
}
