package com.salman.myrestproject.controller;

import com.salman.myrestproject.Home;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RequestMapping("/")
@RestController
public class MyRestController {

    @RequestMapping(method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public String index() throws UnknownHostException {
        return "Hello World!";
    }

    @RequestMapping(value = "/ip", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Home getIpAddress() throws UnknownHostException {
        return new Home("IP address", InetAddress.getLocalHost().getHostAddress());
    }
}
