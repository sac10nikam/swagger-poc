package com.company.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import model.Response;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/v1/contact")
@Api(value = "Contact services", tags = "Contact Services", description = "Contact Services")
public interface ContactController {
    /**
     * Purpose: Fetch contacts.
     * 
     * 
     * @param employeeId
     * @param companyId
     * 
     * @return ReturnResponse
     * @throws Exception
     * @see success data
     * 
     */
    @ApiOperation(value = "getContacts", notes = "Gets the list of contacts", responseContainer = "List<Contact>")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Response.class),
            @ApiResponse(code = 401, message = "Unauthorized", response = Response.class),
            @ApiResponse(code = 403, message = "Forbidden", response = Response.class),
            @ApiResponse(code = 404, message = "Not Found", response = Response.class),
            @ApiResponse(code = 500, message = "Internal server error occured", response = Response.class) })
    @RequestMapping(value = "/{companyId}/{employeeId}/contacts", method = RequestMethod.GET)
    Response getContacts(@PathVariable String employeeId, @PathVariable String companyId);
}