package com.rbs.solution.controller;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import com.rbs.solution.entity.EmployeeDetails;
import com.rbs.solution.service.EmployeeDetailsService;

@Controller
@Path("/internal")
public class EmployeeDetailsController {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeDetailsController.class);

	@Inject
	private EmployeeDetailsService employeeDetailsService;

	@GET
	@Path("/allEmployees")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllEmployeeDetails(@QueryParam(value = "sortingParameter") String sortingParameter,
			@QueryParam(value = "order") String order) {
		sortingParameter = sortingParameter == null ? "NONE" : sortingParameter;
		order = order == null ? "natural" : order;
		logger.info("getAllEmployeeDetails gets called at : {} with sortingParameter : {} and order : {}",
				LocalDateTime.now(), sortingParameter, order);
		if (!Arrays.asList("natural", "reverse").contains(order)) {
			return Response.status(Status.BAD_REQUEST)
					.entity("ordering can be either natural or reverse ; default (natural order)").build();
		}
		try {
			List<EmployeeDetails> empolyeeDetailsList = employeeDetailsService.getAllEmployeeDetails(sortingParameter,
					order);
			return Response.status(Status.OK).entity(empolyeeDetailsList).build();
		} catch (Exception e) {
			logger.error("An error occurred while fetching the employee details : {}", e);
			return Response.status(Status.INTERNAL_SERVER_ERROR).entity("Error Occurred").build();
		}
	}

}
