package com.twu.biblioteca.controller;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by apple on 15-6-22.
 */
public class MovieControllerTest {
    @Test
    public void testMovieList() throws Exception {
        MovieController movieController = new MovieController();
        assertThat(movieController.getMovieList().size(),is(2));
    }

    @Test
    public void testCheckOutMovie() throws Exception {
        MovieController movieController = new MovieController();
       assertThat(movieController.checkoutMovieByName("The Shawshank Redemption"),is("checkout"));

    }
}
