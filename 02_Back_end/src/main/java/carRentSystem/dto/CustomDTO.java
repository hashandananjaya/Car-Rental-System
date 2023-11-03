package carRentSystem.dto;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomDTO {
    private String value;
    private int count;

    public CustomDTO(String lastIndex) {
        this.value=lastIndex;
    }

    public CustomDTO(int count) {
        this.count=count;
    }
}
