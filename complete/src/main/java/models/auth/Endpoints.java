package models.auth;

public class Endpoints {
    private String accessTokenURI;
    private String authorizationURI;

    public void setURIs(String authorizationURI, String accessTokenURI){
        this.authorizationURI = authorizationURI;
        this.accessTokenURI = accessTokenURI;
    }

    public String getaccessTokenURI(){
        return this.accessTokenURI;
    }
    public String getauthorizationURI(){
        return this.authorizationURI;
    }

}