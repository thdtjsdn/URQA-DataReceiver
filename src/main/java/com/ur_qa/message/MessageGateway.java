package com.ur_qa.message;

import org.springframework.integration.annotation.Gateway;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: breakit
 * Date: 2013. 12. 7.
 * Time: 오전 12:06
 */
public interface MessageGateway {
    @Gateway(requestChannel="MessageObject")
    void throwOutMessage(Map<String, String> messageMap);
}
