package com.technopeak.techno.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TechnoController {
	
	
	@GetMapping(path = "/getIp")
	public String getIP() {
		String outPut = "Error";
		try {
			outPut  = InetAddress.getLocalHost().getHostAddress();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return outPut;
	}

}
