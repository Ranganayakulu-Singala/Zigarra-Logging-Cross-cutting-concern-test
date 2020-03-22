package com.company.zigatta.service;

import org.springframework.stereotype.Service;

@Service
public class HttpServiceB {
	public String sendMessage(String message) {
        /*
         assume that some message sends via rest client and gets "httpResponse"
        */
        String httpResponse = "httpResponse";
        return httpResponse;
    }
}
