/*
 * Copyright (c) 2018 by AllenZhang
 */

package com.AllenZhang.controller.api;

import com.AllenZhang.dto.MetaDto;
import com.AllenZhang.service.BookService;
import com.AllenZhang.utils.Status;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;

    private static final Log logger = LogFactory.getLog(BookController.class);

    @RequestMapping(value = "/getAll",method = {RequestMethod.POST})
    public @ResponseBody
    MetaDto getAllBooks(){

        MetaDto m = new MetaDto();
        m.setMessage("哈哈哈");
        m.setStatus(Status.SUCCESS);
        m.setData(bookService.getAllBooks());

        return m;
    }

}