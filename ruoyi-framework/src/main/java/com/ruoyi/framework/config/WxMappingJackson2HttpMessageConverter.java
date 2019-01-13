package com.ruoyi.framework.config;

import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Mandora
 * create at:  2019/1/12  下午5:40
 * @description:
 */

public class WxMappingJackson2HttpMessageConverter extends MappingJackson2HttpMessageConverter {

    public WxMappingJackson2HttpMessageConverter(){
        List<MediaType> mediaTypes = new ArrayList<>();
        mediaTypes.add(MediaType.TEXT_PLAIN);
        mediaTypes.add(MediaType.TEXT_HTML);
//        mediaTypes.add(MediaType.TEXT_XML);
        mediaTypes.add(MediaType.APPLICATION_XML);
        setSupportedMediaTypes(mediaTypes);
    }
}
