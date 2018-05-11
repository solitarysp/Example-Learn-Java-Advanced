package com.higgsup.controller;

import com.higgsup.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {
    @Autowired
    StudentService students1;

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public ResponseEntity<Object> listAllUsers() {

        return new ResponseEntity<Object>(students1, HttpStatus.OK);
    }
}
