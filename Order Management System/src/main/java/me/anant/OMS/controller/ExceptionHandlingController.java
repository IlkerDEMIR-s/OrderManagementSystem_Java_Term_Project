package me.anant.OMS.controller;

import me.anant.OMS.exceptions.OrderNotFoundException;
import me.anant.OMS.exceptions.ProductNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ExceptionHandlingController {

    @ExceptionHandler(Exception.class)
    public ModelAndView handleProductNotFoundException(HttpServletRequest request, Exception exception) {
        ModelAndView mav = new ModelAndView();

        mav.addObject("exception", exception);
        mav.addObject("url", request.getRequestURL());
        mav.setViewName("exception/error");
        return mav;
    }
}
