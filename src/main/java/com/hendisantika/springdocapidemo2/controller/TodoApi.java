package com.hendisantika.springdocapidemo2.controller;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : springdoc-api-demo2
 * User: powercommerce
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/03/22
 * Time: 10.07
 * To change this template use File | Settings | File Templates.
 */
@RequestMapping("/api/todos")
@Tag(name = "Todo API", description = "euismod in pellentesque massa placerat duis ultricies lacus sed turpis")
@SecurityRequirement(name = "api")
interface TodoApi {
}
