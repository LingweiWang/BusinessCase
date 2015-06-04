package com.twu.biblioteca.contoller;

import com.twu.biblioteca.model.Book;

import java.util.ArrayList;

/**
 * Created by apple on 15-6-2.
 */
public class BookController {

    private static ArrayList<Book> booklist =new ArrayList<Book>();
    static{
        booklist.add(new Book("Refactoring","Martin Fowler","April,2010"));
        booklist.add(new Book("Clean code","Robert C. Martin","January,2010"));
    }

    public ArrayList<Book> getList() {
        for(Book book : booklist){
            System.out.println(book.getName()+","+book.getAuthor()+","+book.getPublishTime());
        }

        return  booklist;
    }
    public String mainMenu(String status, String option){
        ArrayList<String> options = new ArrayList<String>();
        options.add("List Books");
        if(status.equals("logged")) {
            if (options.contains(option)) {
                return option;
            } else {
                return "select a valid option";
            }
        }else{
            return "please sign in";
        }


    }
}
