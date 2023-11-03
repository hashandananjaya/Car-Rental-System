package carRentSystem.service;



import carRentSystem.dto.CustomDTO;
import carRentSystem.dto.DriverDTO;
import carRentSystem.entity.Driver;

import java.util.ArrayList;


public interface DriverService {
    void saveDriver(DriverDTO dto);
    void updateDriver(DriverDTO dto);
    void deleteDriver(String reg_ID);
    ArrayList<DriverDTO> getAllDriver();
    ArrayList<DriverDTO> getAllAvalabileDriver();
    CustomDTO userIdGenerate();
    CustomDTO getSumAvailableDriver();
    CustomDTO getSumUnavailableDriver();
    Driver searchDriverId(String id);
    CustomDTO getSumDriver();
}
