/**
 * 
 */
package com.example.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>类的描述</p>
 *
 * @author zhenglz 2016年10月9日
 *
 */
@RestController
public class HelloController {
	
	
	@RequestMapping("/hello")
	public String index(){
		return "Hello World";
	}

}
