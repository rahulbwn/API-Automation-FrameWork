package qa.app.gorest.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserPOJO {
    private String name;
    private String email;
    private String gender;
    private String status;
    public UserPOJO(String name,String email,String gender,String status)
    {
    	this.name=name;
    	this.email=email;
    	this.gender=gender;
    	this.status=status;
    }
}
