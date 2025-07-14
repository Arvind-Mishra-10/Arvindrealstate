package controller;

import Dto.InquiryRequest;
import Service.InquiryService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inquiries")
@CrossOrigin(origins = "*") // Allow CORS if frontend is on a different domain
public class Submit_form {
    @Autowired
    private InquiryService inquiryService;

    @PostMapping
    public ResponseEntity<String> submitInquiry(@Valid @RequestBody InquiryRequest request) {
        inquiryService.saveInquiry(request);
        return ResponseEntity.ok("Inquiry submitted successfully!");
    }

}
