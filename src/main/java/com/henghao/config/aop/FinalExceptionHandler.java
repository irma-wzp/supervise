package com.henghao.config.aop;/**
 * Created by admin on 2017/12/10.
 */

import org.springframework.boot.autoconfigure.web.ErrorController;

/**
 * @description 在进入Controller之前，譬如请求一个不存在的地址，404错误。
 * @author  王章鹏
 * @create on 2017 - 12 - 10
 */
public class FinalExceptionHandler implements ErrorController {
    @Override
    public String getErrorPath() {

        return "error";
    }

    /*
    @RequestMapping(value = "/error")
    public Object error(HttpServletResponse resp, HttpServletRequest req) {
        // 错误处理逻辑
        return "其他异常";
    }
    */
}
