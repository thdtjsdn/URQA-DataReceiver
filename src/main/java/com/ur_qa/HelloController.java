package com.ur_qa;

import com.ur_qa.message.MessageGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    MessageGateway messageGateway;


	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

        addMessage();

		model.addAttribute("message", "Hello world!");
		return "hello";
	}

    private void addMessage(){
        Map<String, String> messageMap = new HashMap<String, String>();
        messageMap.put("message", "Hello world!");
        messageGateway.throwOutMessage(messageMap);
    }
}