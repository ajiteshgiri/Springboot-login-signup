package com.security.assignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MysqlDataSource implements Datasource{

    @Override
    public String[] getemail() {
        String [] email = {"ajitesh@gmail.com","deepak@gmail.com","ravikant@gmail.com"};
        return email;
    }
}
