package carRentSystem.service;



import carRentSystem.dto.UserDTO;

import java.util.ArrayList;


public interface UserService {
    ArrayList<UserDTO> getAllRegUsers();

    UserDTO getRegUsers(String username,String password);

}
