package com.security.assignment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;


@Component
public class EmailService {
    Datasource datasource;


    public EmailService(Datasource datasource) {
        this.datasource = datasource;
    }

    public void sendEmail(){
       String emails [] = datasource.getemail();
       for(String email : emails){
           System.out.println(email);
       }
    }
}
