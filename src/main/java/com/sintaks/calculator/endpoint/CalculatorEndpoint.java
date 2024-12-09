package com.sintaks.calculator.endpoint;


import com.sintaks.calculator.AddRequest;
import com.sintaks.calculator.AddResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;



@Endpoint
public class CalculatorEndpoint {
    private static final String NAMESPACE_URI = "http://sintaks.com/demo";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AddRequest")
    @ResponsePayload
    public AddResponse add(@RequestPayload AddRequest request) {
        int num1 = request.getNum1();
        int num2 = request.getNum2();

        AddResponse response = new AddResponse();
        response.setResult(num1 + num2);

        return response;
    }
}

