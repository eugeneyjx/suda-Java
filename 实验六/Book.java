import java.text.SimpleDateFormat;
import java.util.*;

class SortbyDate implements Comparator {
    public int compare(Object o1, Object o2){
        Book b1=(Book) o1;
        Book b2=(Book) o2;
        return b1.getDate().compareTo(b2.getDate());
    }
}

public class Book {
    String name;
    int price;
    Calendar publishDate;
    Book(String n, int p, Calendar t){
        name=n;
        price=p;
        publishDate=t;
    }
    Calendar getDate()
    {
        return publishDate;
    }
    public static void main(String args[]){
        Calendar ta=Calendar.getInstance();
        Calendar tb=Calendar.getInstance();
        Calendar tc=Calendar.getInstance();
        Calendar td=Calendar.getInstance();
        Calendar te=Calendar.getInstance();
        ta.set(2016,1,12);
        tb.set(2017,2,14);
        tc.set(2016,3,25);
        td.set(2018,4,20);
        te.set(2017,12,23);

        Book a=new Book("a",10,ta);
        Book b=new Book("b",10,tb);
        Book c=new Book("c",10,tc);
        Book d=new Book("d",10,td);
        Book e=new Book("e",10,te);
        List<Book> arr=new ArrayList<Book>();
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);
        arr.add(e);
        Collections.sort(arr,new SortbyDate());
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        for(Book book:arr){
            System.out.println(book.name+" 出版时间："+df.format(book.getDate().getTime()));
        }
    }
}