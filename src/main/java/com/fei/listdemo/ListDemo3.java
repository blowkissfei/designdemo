package com.fei.listdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author dengfeiwen
 * @version V1.0
 * @Package com.fei.listdemo
 * @date 2019/10/9 16:57
 * @Copyright © 2019
 */

class Book{
    private String name;
    private int price;
    private String press;// 出版社
    private String author;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", press='" + press + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public Book(String name, int price, String press, String author) {
        this.name = name;
        this.price = price;
        this.press = press;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class SortByPrice implements Comparable, Comparator<Book> {

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public int compare(Book o1, Book o2) {
        if(o1.getPrice()>o2.getPrice()){
            return 1;
        }
        return 0;
    }
}

public class ListDemo3 {
    public static void main(String[] args) {
        List<Book> list=new ArrayList<>();
        Book b1 = new Book("哪吒", 20, "封神演义出版社", "元始天尊");
        Book b2 = new Book("杨戬", 25, "封神演义出版社", "元始天尊");
        Book b3 = new Book("孙悟空", 30, "封神演义出版社", "元始天尊");
        Book b4 = new Book("姜子牙", 35, "封神演义出版社", "元始天尊");
        Book b5 = new Book("姬发", 40, "封神演义出版社", "元始天尊");
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        list.add(b5);
        Collections.sort(list,new SortByPrice());
        System.out.println(list);

    }

}
