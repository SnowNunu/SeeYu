package com.ruoyi.framework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.*;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : Mandora
 * create at:  2019/1/12  下午5:39
 * @description: RestTemplate配置
 */

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate(ClientHttpRequestFactory factory){
        RestTemplate template = new RestTemplate(factory);
        template.getMessageConverters().add(new WxMappingJackson2HttpMessageConverter());
        List<ClientHttpRequestInterceptor> interceptors = new ArrayList<ClientHttpRequestInterceptor>();
        interceptors.add(new LoggingRequestInterceptor());
        template.setInterceptors(interceptors);
        ResponseErrorHandler responseErrorHandler = new ResponseErrorHandler() {
            @Override
            public boolean hasError(ClientHttpResponse clientHttpResponse) throws IOException {
                return false;
            }

            @Override
            public void handleError(ClientHttpResponse clientHttpResponse) throws IOException {
                System.out.println(clientHttpResponse);
            }
        };
        template.setErrorHandler(responseErrorHandler);
        return template;
    }

    @Bean
    public ClientHttpRequestFactory simpleClientHttpRequestFactory(){
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setReadTimeout(15000);//ms
        factory.setConnectTimeout(15000);//ms
        return new BufferingClientHttpRequestFactory(factory);
    }
}
