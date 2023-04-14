package day55_OOPRecap_CollectionIntro;

import java.time.LocalDate;

public class Encapsulation {

    private String bookName;
    private final LocalDate publishedDate = LocalDate.of(1998,5,28);

    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName){
        if (bookName.isEmpty()){
            throw new RuntimeException("Book name cannot be empty");
        }
        this.bookName = bookName;
    }


    public LocalDate getPublishedDate(){
        return publishedDate;
    }

    /*
    public void setPublishedDate(LocalDate publishedDate){
        this.publishedDate = publishedDate;
    }
     */

    public static void main(String[] args) {

    }

    public Encapsulation(){

    }

    }
    class Test{
        public static void main(String[] args) {
            Encapsulation obj = new Encapsulation();

            obj.setBookName("Java");
            System.out.println(obj.getBookName());
        }
}
