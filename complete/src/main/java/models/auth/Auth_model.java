package models.auth;

public class Auth_model {
    private String clientId;
    private String clientSecret;

    public String getId(){
        return this.clientId;
    }

    public String getSecret(){
        return this.clientSecret;
    }

    public void setData(String clientId, String clientSecret){
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }
}