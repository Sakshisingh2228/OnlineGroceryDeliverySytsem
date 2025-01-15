package com.clickit.inteceptor;

import com.clickit.model.User;
import com.clickit.service.TokenService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.nio.charset.StandardCharsets;

@Component
public class AdminInterceptor implements HandlerInterceptor {

    @Autowired
    private TokenService tokenService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if(request.getHeader("access-control-request-headers") !=null && request.getHeader("access-control-request-headers").contains("x-auth-token")){
            return true;
        }
        String token = request.getHeader("X-Auth-Token");
        if(token == null || token.strip().isBlank()){
            response.setStatus(401);
            response.setHeader("Access-Control-Allow-Origin","*");
            response.getOutputStream().write("{\"message\":\"Invalid Credential!\"}".getBytes(StandardCharsets.UTF_8));
            return false;
        }
        User user = tokenService.getUserByToken(token);
        if(user == null){
            response.setStatus(401);
            return false;
        }
        request.setAttribute("auth-user", user);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("Post Handle");

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

        System.out.println(response.getHeaderNames());
    }
}
