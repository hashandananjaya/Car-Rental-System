package carRentSystem.dto;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AdminDTO {
    private String user_Id;
    private Name name;
    private String contact_No;
    private String address;
    private String email;
    private String nic;

    private UserDTO user;

}
