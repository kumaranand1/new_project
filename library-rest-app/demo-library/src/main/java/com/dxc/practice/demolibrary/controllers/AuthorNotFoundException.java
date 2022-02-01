package com.dxc.practice.demolibrary.controllers;

public class AuthorNotFoundException extends RuntimeException {
    AuthorNotFoundException(Integer id) {
        super("Could not find Book " + id);
    
}
}
