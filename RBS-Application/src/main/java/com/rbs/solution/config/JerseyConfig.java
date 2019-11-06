package com.rbs.solution.config;


import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.rbs.solution.controller.EmployeeDetailsController;


@Component
@ApplicationPath("/rbs")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(EmployeeDetailsController.class);
	}
}
