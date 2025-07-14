package Service;

import Dto.InquiryRequest;
import Model.Inquiry;
import Repo.InquiryRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
@Data
public class InquiryService {
    @Autowired
    private InquiryRepository inquiryRepository;

    public void saveInquiry(InquiryRequest request) {
        Inquiry inquiry = new Inquiry();
        inquiry.setFullName(request.getFullName());
        inquiry.setEmail(request.getEmail());
        inquiry.setCompany(request.getCompany());
        inquiry.setMessage(request.getMessage());
        inquiryRepository.save(inquiry);
    }
}
