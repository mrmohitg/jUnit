package com.landonhotel.eventsapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.landonhotel.eventsapp.domain.QuoteRequest;

@Controller
public class QuoteRequestController {

	@GetMapping
    public String beginQuoteRequest() {
        
    		return "newQuote";
    }
    
	@PostMapping
    public String submitQuoteRequest() {
        
    		return "newQuoteConfirmation";
    }

}
