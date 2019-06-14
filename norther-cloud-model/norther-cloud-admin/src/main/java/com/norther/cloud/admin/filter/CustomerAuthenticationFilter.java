package com.norther.cloud.admin.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang.StringUtils;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jcb
 * @version : CustomerAuthenticationFilter, v 0.1 2019/6/14 16:48 jcb Exp$
 * @Description:
 */
public class CustomerAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    private ThreadLocal<Map<String,String>> threadLocal = new ThreadLocal<>();

    @Override
    protected String obtainPassword(HttpServletRequest request) {
        String password = this.getBodyParams(request).get(super.SPRING_SECURITY_FORM_PASSWORD_KEY);
        if(StringUtils.isNotBlank(password)){
            return password;
        }
        return super.obtainPassword(request);
    }

    @Override
    protected String obtainUsername(HttpServletRequest request) {
        String username = this.getBodyParams(request).get(super.SPRING_SECURITY_FORM_USERNAME_KEY);
        if(StringUtils.isNotBlank(username)){
            return username;
        }
        return super.obtainUsername(request);
    }

    /**
     * 获取body参数
     * @param request
     * @return
     */
    private Map<String,String> getBodyParams(HttpServletRequest request){
        Map<String,String> bodyParams =  threadLocal.get();
        if(bodyParams==null) {
            ObjectMapper objectMapper = new ObjectMapper();
            try (InputStream is = request.getInputStream()) {
                bodyParams = objectMapper.readValue(is, Map.class);
            } catch (IOException e) {
            }
            if(bodyParams==null) bodyParams = new HashMap<>();
            threadLocal.set(bodyParams);
        }

        return bodyParams;
    }
}
