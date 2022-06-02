package com.restservice.service;

class OrderNotFoundException extends RuntimeException {

    OrderNotFoundException(Long id) {
        super("Could not find order " + id);
    }
}
