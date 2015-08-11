package src.DTO;

/**
 * Created by SHIFENG258 on 2015/8/6.
 */
public class UserDTO {
    private String userId;
    private String email;
    private String userName;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserId(String userId) {

        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "{userId:"+this.userId+",\n\r"+
                "userName:"+this.userName+",\n\r"+
                "Email:"+this.email+"}";
    }
}
