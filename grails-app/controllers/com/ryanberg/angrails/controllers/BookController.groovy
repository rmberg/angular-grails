package com.ryanberg.angrails.controllers

import com.ryanberg.angrails.model.Book
import grails.plugin.springsecurity.annotation.Secured
import grails.rest.RestfulController

@Secured(['ROLE_ADMIN'])
class BookController extends RestfulController {

    static responseFormats = ['html', 'json']

    BookController() {
        super(Book)
    }
}
