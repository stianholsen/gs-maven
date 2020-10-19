package models.auth;
public class Auth_model {
    private String clientId;
    private String clientSecret;
    private String appURI;
    private String redirectURI;


    public String getId(){
        return this.clientId;
    }

    public String getSecret(){
        return this.clientSecret;
    }

    public String getAppURI(){
        return this.appURI;
    }

    public String getRedirectURI(){
        return this.redirectURI;
    }

    public void setData(String clientId, String clientSecret, String appURI, String redirectURI){
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.appURI = appURI;
        this.redirectURI = redirectURI;
    }
}