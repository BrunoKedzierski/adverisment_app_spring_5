package com.bkk.advertisment_app_spring_5.startup;

import com.bkk.advertisment_app_spring_5.services.PostService;
import com.bkk.advertisment_app_spring_5.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements CommandLineRunner {

    private final UserService userService;
    private final PostService postService;

    public DataInit(UserService userService, PostService postService) {
        this.userService = userService;
        this.postService = postService;
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
