package com.realState.Arvindrealstate.controller;

import com.realState.Arvindrealstate.Dto.InquiryRequest;
import com.realState.Arvindrealstate.Service.InquiryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inquiries")
public class Submit_form {
    @Autowired
    private InquiryService inquiryService;
    @PostMapping
    public ResponseEntity<String> submitInquiry(@Valid @RequestBody InquiryRequest request){
       Boolean saveed =  inquiryService.saveInquiry(request);
        return ResponseEntity.ok("Inquiry submitted successfully!"+ saveed);
    }

}
