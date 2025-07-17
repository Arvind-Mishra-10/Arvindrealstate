package com.realState.Arvindrealstate.Service;

import com.realState.Arvindrealstate.Dto.InquiryRequest;
import com.realState.Arvindrealstate.Model.Inquiry;
import com.realState.Arvindrealstate.Repo.InquiryRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class InquiryService {
    @Autowired
    private InquiryRepository inquiryRepository;

    public Boolean saveInquiry(InquiryRequest request) {
        Inquiry inquiry = new Inquiry();
        inquiry.setFullName(request.getFullName());
        inquiry.setEmail(request.getEmail());
        inquiry.setCompany(request.getCompany());
        inquiry.setMessage(request.getMessage());
        Inquiry Saved =  inquiryRepository.save(inquiry);
        if(Saved!=null){
            return true;
        }
        return  true;
    }
}
