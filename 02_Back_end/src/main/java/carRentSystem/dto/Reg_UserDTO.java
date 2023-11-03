package carRentSystem.dto;

import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Reg_UserDTO {
    private String user_Id;
    private Name name;
    private String contact_No;
    private String address;
    private String email;
    private String nic;
    private String license_No;
    private MultipartFile nic_Img;
    private MultipartFile license_Img;

    private UserDTO user;

}