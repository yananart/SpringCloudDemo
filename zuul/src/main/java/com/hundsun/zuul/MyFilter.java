package com.hundsun.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * created by Yananart
 *
 * @author Yananart
 * @date 2018/8/2
 */
@Component
public class MyFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";  //过滤器类型，前置
        /*pre:请求执行之前filter
          route: 处理请求，进行路由
          post: 请求处理完成后执行的filter
          error:出现错误时执行的filter
         */
    }

    @Override
    public int filterOrder() {
        return 0;  //优先级，数字越大越低
    }

    @Override
    public boolean shouldFilter() {
        return true;  //是否要过滤，是
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request=requestContext.getRequest();
        String accessToken = request.getParameter("token");
        if(!accessToken.equals("123")) {
            requestContext.setSendZuulResponse(false);  //过滤，不对其进行路由
        }
        return null;
    }
}
