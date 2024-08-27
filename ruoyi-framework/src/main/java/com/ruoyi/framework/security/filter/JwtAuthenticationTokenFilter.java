package com.ruoyi.framework.security.filter;

import java.io.IOException;
import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.framework.web.service.TokenService;

/**
 * token过滤器 验证token有效性
 *
 * @author LiMengYuan
 * @date 2024/8/19 17:45
 */
@Component
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter
{
    @Resource
    private TokenService tokenService;

    /**
     * 获取用户身份信息
     *
     * @param request
     * @param response
     * @param chain
     * @return
     * @throws
     * @date 2024/8/19 17:44
     */
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
            throws ServletException, IOException
    {
        //获取redis中对应的用户身份信息
        LoginUser loginUser = tokenService.getLoginUser(request);
        //Authentication为空，且loginUser不为空时
        if (StringUtils.isNotNull(loginUser) && StringUtils.isNull(SecurityUtils.getAuthentication()))
        {
            //刷新有效期
            tokenService.verifyToken(loginUser);
            //封装用户名和密码的认证信息，可以将认证信息存储在SecurityContextHolder中，以便在应用程序中获取和验证用户的身份
            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(loginUser, null, loginUser.getAuthorities());
            authenticationToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
        }
        //继续过滤器链
        chain.doFilter(request, response);
    }
}
