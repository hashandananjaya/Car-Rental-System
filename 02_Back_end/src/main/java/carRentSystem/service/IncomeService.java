package carRentSystem.service;



import carRentSystem.dto.IncomeDTO;

import java.util.ArrayList;


public interface IncomeService {
    ArrayList<IncomeDTO> dailyIncome();
    ArrayList<IncomeDTO> monthlyIncome();
    ArrayList<IncomeDTO> AnnuallyIncome();
}
