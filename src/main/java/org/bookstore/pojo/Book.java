package org.bookstore.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Book {
    private String title;
    private Float price;
    private String desc;
    private String number;

    public Book(String title, Float price, String desc) {
        this.title = title;
        this.price = price;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", desc='" + desc + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
