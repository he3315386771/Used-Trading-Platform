package com.hejj.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by wsk1103 on 2017/10/18.
 */
@Aspect
public class OnlyOneUser {
    @Before(value = "execution(* com.hejj.controller.UserController.login(..))")
    public void isExit(){

    }
}
