package com.hendisantika.springdocapidemo2.controller;

import com.hendisantika.springdocapidemo2.model.Todo;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : springdoc-api-demo2
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/03/22
 * Time: 10.10
 * To change this template use File | Settings | File Templates.
 */
@RestController
class TodoController implements TodoApi {

    private List<Todo> todos;
}
