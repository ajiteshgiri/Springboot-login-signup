package com.security.assignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class PostGresDatasource implements Datasource{

    @Override
    public String[] getemail() {
        String [] email = {"sameer@gmail.com","deepak@gmail.com","ravikant@gmail.com"};
        return email;
    }
}
