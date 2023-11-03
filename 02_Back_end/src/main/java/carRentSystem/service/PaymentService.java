package carRentSystem.service;


import carRentSystem.dto.CustomDTO;
import carRentSystem.dto.PaymentDTO;

import java.util.ArrayList;

public interface PaymentService {
    CustomDTO paymentIdGenerate();
    void savePayment(PaymentDTO dto, String rentID);
    ArrayList<PaymentDTO> getAllPayment();
}
