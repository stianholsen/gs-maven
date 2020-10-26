package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BearerToken
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-24T19:28:18.999418-04:00[America/New_York]")


public class BearerToken   {
  @JsonProperty("access_token")
  private String accessToken = null;

  @JsonProperty("expires_in")
  private Long expiresIn = null;

  @JsonProperty("token_type")
  private String tokenType = null;

  @JsonProperty("refresh_token")
  private String refreshToken = null;

  public BearerToken accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Access token
   * @return accessToken
  **/
  @ApiModelProperty(example = "eyJjdHkiOiJKV1QiLCJlbmMiOiJBMTI4R0NNIiwiYWxnIjoiZGlyIn0..EM2YgJGre7OTIpmA.8GmpStB05uh4u_1wrEpyVCV_P5XwTcbL7zF_NsZJaMcZvo3B78gqhDR2lCCGLbTTImM4ILGHEQXO5Q7-obmdacIk9jcRr2eg5lTj_MBk9ch9yCMGh1NLEtXfOuHO1WzLoR6njQLDHdvvA2M3MEnVToqF6NdRI5f1hpWwC75TwUJWG50YTTYUBJskGPuRMLPfuTH-sncyVpI5Pj-XwXgcwOuXq8mz87DE1ZCCxPollReFZFsriQO3FeAqdgKigLaDH_WsoromxG2RAz6u4de-IYwXeWhsyq81SvOICE29kLMl9uxCvp6frYzOHoe7rfSaJiPhWGLn4_l29GimVNepQi1BadFqvHUyr7pUtO4Nx8e3piN7RV4DpMu1mf8_BYJaNUMyaeismu7RS9CmXm8wiEwgxK6f6vSOZxK6X8k7EHNKmZJZyR0q5ZRtFMzNa27tFah5_CybeJ86dJYIoaS1yG4rwBhokM06lVwAUAnpjXSRdoD7VUeNeg70DvTS2rtLa_w0_RLpva-iGkup-GIQyURK_jDZF2dVlRIanA8cwF6PZTA4cVslCd6EScJx9AHG87MmiWs6j0KOLZRyun3N3BEeRrjjcPk_lc3zcd8E2MZB4l-4o69cYvgAk1DpkxB__3IyuVkTEGwxlvT04anjsGLXEiunvQnDlAyEApr4xBeIGA2tAU8sstOQgGQffRj17iXWFgh4n5uHP77wrA4_d1tydAGCBhEVk6tsUVA81cavlwEfF53Yn1SK9bVofKv412tzU8fzNecni0IAsuWsCLGX.z3MMhpzmMp-GwdbTSl2rWQ", value = "Access token")
  
    public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public BearerToken expiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * Token expiration time
   * @return expiresIn
  **/
  @ApiModelProperty(example = "3600", value = "Token expiration time")
  
    public Long getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Long expiresIn) {
    this.expiresIn = expiresIn;
  }

  public BearerToken tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  /**
   * Token type
   * @return tokenType
  **/
  @ApiModelProperty(example = "Bearer", value = "Token type")
  
    public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public BearerToken refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * Refresh token
   * @return refreshToken
  **/
  @ApiModelProperty(example = "eyJjdHkiOiJKV1QiLCJlbmMiOiJBMjU2R0NNIiwiYWxnIjoiZGlyIn0..9IxfdEexBagh8deitsB4_pSVMs-y7OZ73k07MKTUufBOCUWpuBx3cRyPaGfMvwehEhefL2Ffi_FYhBb-StxF_m59aA2kqJimtSX0mr3Ogd5bLWNc2fXSEHPoKEJyzIVi-V-wjv6hBspUAk008Fq26tzvhjrBoswqUdqfmbksXED02fjMYYYP9Fcn7Jg3JO_AjEswxgqmWGsfhHIdNXrPPGpIfk7R0G0sehignbOjDraxCfYsYmp_6zxh5Ja2QDvsRlhAqdSRgX_I7kEpZFZbtJk-19mYMK7eOidTkLMPuhhg_7UcJSo5PjuFMhgvNJKx8UWiyRFlLAWCdo6CknQgJDGCGTiNCUoHywlZBYVmsPJlQITIOHgjvhQQa6Bk3xVs_r4gVfJiKqI4y96l6Tw9ydHJQrLw-4eJBdjisPpUZlrGgvP_WUYigVzco95kSQcT1WqBHhCMdGchPm0mEPD4BSpzHOvlIqmXaiGSwLC4YxQn_PfWWGGnbPvcfg8GJoX4iR6nv_Excn32mpUWlbl7lo-YD2c45oJVJVqFrADRqtQN-lR84cXmd75Gr7R7IJxgZnH8C6EfrBAiy_QEScsIOoDFESqAvUPCXj8FH9_cdWkeLsLSEkJwLOeLcTF73iXG7h_L_giz3t6zjNRa2WxErOxdYF0G453xQb4nFH1X9gc2jnSInmt1jiZGL3WSSXcCWjTSwQq3WhgVfjVTszMF_3F5NnSPHKuKpYf1Dc1kG_F0egzg2HIwTESZOr1jsmMjfyW42jotjc8JhbnjTU-dOgopCf5jWjzTeXFgdxgow7Am3NQa8R3wudqTQD7q5-ItMhW5mVt8TKk7IFjxd2r5tTJFiIsi8nyXOEujs4GuWtmL8gfqrulA7MgodN-FFXPGpa4KbLCGgO7dr5qY-eYLcg._OZAqZevjU4wIAe7D8aQfw", value = "Refresh token")
  
    public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BearerToken bearerToken = (BearerToken) o;
    return Objects.equals(this.accessToken, bearerToken.accessToken) &&
        Objects.equals(this.expiresIn, bearerToken.expiresIn) &&
        Objects.equals(this.tokenType, bearerToken.tokenType) &&
        Objects.equals(this.refreshToken, bearerToken.refreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn, tokenType, refreshToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BearerToken {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
