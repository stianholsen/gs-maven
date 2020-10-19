package models.auth;

import lombok.Data;

public class StartAuthModel {
    private String clientId;
    private String clientSecret;
    private String country;
    private int duration;
    private String redirectURI;
    private String scope;

    public StartAuthModel(String clientId, String clientSecret, String country, int duration, String redirectURI, String scope){
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.country = country;
        this.duration = duration;
        this.scope = scope;
        this.redirectURI = redirectURI;
    }

    public String getId(){
        return this.clientId;
    }

    public String getSecret(){
        return this.clientSecret;
    }

    public String getCountry(){
        return this.country;
    }

    public int getDuration(){
        return this.duration;
    }

    public String getScope(){
        return this.scope;
    }

    public String getRedirectURI(){
        return this.redirectURI;
    }

}