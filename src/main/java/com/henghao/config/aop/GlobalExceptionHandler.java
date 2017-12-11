package com.henghao.config.aop;/**
 * Created by admin on 2017/12/10.
 */

import org.slf4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.http.HttpStatus.NOT_EXTENDED;

/**
 * @description: 全局异常处理
 * @auth 王章鹏
 * @create: on 2017 - 12 - 10
 */
//@ControllerAdvice(annotations=RestController.class)
//@ControllerAdvice(basePackages={"com.xxx","com.ooo"})
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

//    private static Logger logger = LogManager.getLogger(GlobalExceptionHandler.class.getName());

    //    @ExceptionHandler(value={RuntimeException.class,MyRuntimeException.class})
    //    @ExceptionHandler//处理所有异常
    @ExceptionHandler(value = Exception.class)
    public String exceptionHandler(HttpServletRequest request, Exception e) throws Exception {

        String host = request.getRemoteHost();
        int remotePort = request.getRemotePort();
        System.out.println(remotePort+"----prot");
        System.out.println(host);
        String requestURI = request.getRequestURI();
        String s = request.getRequestURL().toString();
        System.out.println(s);
        System.out.println(requestURI);
        return "index";
    }


    /**
     * 在controller里面内容执行之前，校验一些参数不匹配啊，Get post方法不对啊之类的
     */
    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {
        System.out.println("错误");

        return new ResponseEntity<Object>("出错了", NOT_EXTENDED);

    }
}
