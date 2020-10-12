package com.example.demo;

import com.example.demo.data.UserDetails;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JSAController {

    @RequestMapping(value = "/JsaService", method = RequestMethod.GET)
    public UserDetails getUserDetails()
    {
        UserDetails userDetails = new UserDetails("1234676886","JSA", "1300GBP");
        return userDetails;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public UserDetails getDefaultUserDetails()
    {
        UserDetails userDetails = new UserDetails("1234676886"," ", "1100GBP");
        return userDetails;
    }
}
