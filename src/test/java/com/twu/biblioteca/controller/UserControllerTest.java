package com.twu.biblioteca.controller;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by apple on 15-6-23.
 */
public class UserControllerTest {
    @Test
    public void testCheckUserInformation() throws Exception {
        UserController userController = new UserController();
        assertThat(userController.checkUserInformation("730-1991").getEmailAddress(),is("234443837@qq.com"));
        assertThat(userController.checkUserInformation("730-1991").getUserName(),is("lwwang"));
        assertThat(userController.checkUserInformation("730-1991").getPhoneNumber(),is("15271862801"));


    }
}
