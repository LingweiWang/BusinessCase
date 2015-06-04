package com.twu.biblioteca.controller;

import com.twu.biblioteca.contoller.BookController;
import com.twu.biblioteca.contoller.UserController;
import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by apple on 15-6-2.
 */
public class BookControllerTest {

    private User user;
    private UserController userController;
    private BookController bookController;
    private ArrayList<Book> list;

    @Before
    public void setUp() throws Exception {
        user = new User();
        userController = new UserController();
        bookController = new BookController();
        list = bookController.getList();
    }

    @Test
    public void testWelcomeMessage() throws Exception {
        assertThat(userController.login(user),is("Welcome!"));
    }

    @Test
    public void testBookList() throws Exception {
        assertThat(list.size(), is(2));
    }

    @Test
    public void testBookDetail() throws Exception {
        ArrayList<Book> list = bookController.getList();
        assertThat(list.get(0).getAuthor(),is("Martin Fowler"));
        assertThat(list.get(1).getPublishTime(),is("January,2010"));
    }

    @Test
    public void testMainMenu() throws Exception {
        userController.login(user);
        assertThat(bookController.mainMenu(user.getStatus(), "List Books"), is("List Books"));
        assertThat(bookController.mainMenu(user.getStatus(),"Books Detail"),is("select a valid option"));
    }

    @Test
    public void testQuit() throws Exception {
        userController.quit(user);
        assertThat(bookController.mainMenu(user.getStatus(), "List Books"), is("please sign in"));
    }
}
