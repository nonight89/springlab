package com.zhoukai.springlab.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/lab")
public class LabController {
    private final static Log logger = LogFactory.getLog(LabController.class);
    
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting() {
        return "Welcome!";
    }

    /**
     * Use @GetMapping to narrow the mapping
     * @return
     */
    @GetMapping("/member/getall")
    public Map<String, Object> getMembers() {
        return new HashMap<String, Object>();
    }

    @PostMapping("/member/create")
    public String createMember() {
        return "success";
    }
    
    @DeleteMapping("/member/delete")
    public String delete() {
        return "delete success";
    }
    /**
     * Get member info <br>
     * 
     * URI templates <br>
     * be used for convenient access to selected parts of a URL in a <code>@RequestMapping</code> method
     * 
     * @param memberId
     * @return
     */
    @GetMapping("/member/{memberId}")
    public Map<String, Object> memberInfo(@PathVariable String memberId) {
        return new HashMap<String, Object>();
    }
    
    @GetMapping("/test")
    public Map<String, Object> test(@PathVariable String memberId) {
        return new HashMap<String, Object>();
    }
}
