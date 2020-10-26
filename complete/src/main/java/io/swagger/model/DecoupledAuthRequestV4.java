package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DecoupledAuthRequestV4
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-24T19:28:18.999418-04:00[America/New_York]")


public class DecoupledAuthRequestV4   {
  @JsonProperty("account_list")
  @Valid
  private List<String> accountList = null;

  @JsonProperty("duration")
  private Integer duration = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("max_tx_history")
  private Integer maxTxHistory = null;

  @JsonProperty("psu_id")
  private String psuId = null;

  @JsonProperty("response_type")
  private String responseType = null;

  /**
   * Gets or Sets scope
   */
  public enum ScopeEnum {
    ACCOUNTS_BASIC("ACCOUNTS_BASIC"),
    
    ACCOUNTS_BALANCES("ACCOUNTS_BALANCES"),
    
    ACCOUNTS_DETAILS("ACCOUNTS_DETAILS"),
    
    ACCOUNTS_TRANSACTIONS("ACCOUNTS_TRANSACTIONS"),
    
    PAYMENTS_MULTIPLE("PAYMENTS_MULTIPLE");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ScopeEnum fromValue(String text) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("scope")
  @Valid
  private List<ScopeEnum> scope = new ArrayList<ScopeEnum>();

  @JsonProperty("state")
  private String state = null;

  public DecoupledAuthRequestV4 accountList(List<String> accountList) {
    this.accountList = accountList;
    return this;
  }

  public DecoupledAuthRequestV4 addAccountListItem(String accountListItem) {
    if (this.accountList == null) {
      this.accountList = new ArrayList<String>();
    }
    this.accountList.add(accountListItem);
    return this;
  }

  /**
   * Account list
   * @return accountList
  **/
  @ApiModelProperty(example = "[41351300039,1234567890]", value = "Account list")
  
    public List<String> getAccountList() {
    return accountList;
  }

  public void setAccountList(List<String> accountList) {
    this.accountList = accountList;
  }

  public DecoupledAuthRequestV4 duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Duration of access authorization in minutes. range: 1 to 129600 minutes (90 days)
   * @return duration
  **/
  @ApiModelProperty(example = "3600", required = true, value = "Duration of access authorization in minutes. range: 1 to 129600 minutes (90 days)")
      @NotNull

    public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public DecoupledAuthRequestV4 language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Language of message that will be displayed to client of bankId mobile app, ISO639-1 and 639-2
   * @return language
  **/
  @ApiModelProperty(example = "sv, en", value = "Language of message that will be displayed to client of bankId mobile app, ISO639-1 and 639-2")
  
    public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public DecoupledAuthRequestV4 maxTxHistory(Integer maxTxHistory) {
    this.maxTxHistory = maxTxHistory;
    return this;
  }

  /**
   * Maximum transaction history in months. Optional if ACCOUNTS_TRANSACTIONS scope is requested. Default=12 months. range: 1 to 12 months
   * @return maxTxHistory
  **/
  @ApiModelProperty(example = "10", value = "Maximum transaction history in months. Optional if ACCOUNTS_TRANSACTIONS scope is requested. Default=12 months. range: 1 to 12 months")
  
    public Integer getMaxTxHistory() {
    return maxTxHistory;
  }

  public void setMaxTxHistory(Integer maxTxHistory) {
    this.maxTxHistory = maxTxHistory;
  }

  public DecoupledAuthRequestV4 psuId(String psuId) {
    this.psuId = psuId;
    return this;
  }

  /**
   * Personnummer given by the Swedish customer.
   * @return psuId
  **/
  @ApiModelProperty(example = "193805010844", required = true, value = "Personnummer given by the Swedish customer.")
      @NotNull

    public String getPsuId() {
    return psuId;
  }

  public void setPsuId(String psuId) {
    this.psuId = psuId;
  }

  public DecoupledAuthRequestV4 responseType(String responseType) {
    this.responseType = responseType;
    return this;
  }

  /**
   * Response type, for decoupled authorization this should be 'nordea_token'
   * @return responseType
  **/
  @ApiModelProperty(example = "nordea_token", required = true, value = "Response type, for decoupled authorization this should be 'nordea_token'")
      @NotNull

    public String getResponseType() {
    return responseType;
  }

  public void setResponseType(String responseType) {
    this.responseType = responseType;
  }

  public DecoupledAuthRequestV4 scope(List<ScopeEnum> scope) {
    this.scope = scope;
    return this;
  }

  public DecoupledAuthRequestV4 addScopeItem(ScopeEnum scopeItem) {
    this.scope.add(scopeItem);
    return this;
  }

  /**
   * Scope list. Note: ACCOUNTS_BASIC must be present at a minimum, when requesting ACCOUNTS_* scopes
   * @return scope
  **/
  @ApiModelProperty(required = true, value = "Scope list. Note: ACCOUNTS_BASIC must be present at a minimum, when requesting ACCOUNTS_* scopes")
      @NotNull

    public List<ScopeEnum> getScope() {
    return scope;
  }

  public void setScope(List<ScopeEnum> scope) {
    this.scope = scope;
  }

  public DecoupledAuthRequestV4 state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The OAuth2 state parameter
   * @return state
  **/
  @ApiModelProperty(example = "anyString", required = true, value = "The OAuth2 state parameter")
      @NotNull

    public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecoupledAuthRequestV4 decoupledAuthRequestV4 = (DecoupledAuthRequestV4) o;
    return Objects.equals(this.accountList, decoupledAuthRequestV4.accountList) &&
        Objects.equals(this.duration, decoupledAuthRequestV4.duration) &&
        Objects.equals(this.language, decoupledAuthRequestV4.language) &&
        Objects.equals(this.maxTxHistory, decoupledAuthRequestV4.maxTxHistory) &&
        Objects.equals(this.psuId, decoupledAuthRequestV4.psuId) &&
        Objects.equals(this.responseType, decoupledAuthRequestV4.responseType) &&
        Objects.equals(this.scope, decoupledAuthRequestV4.scope) &&
        Objects.equals(this.state, decoupledAuthRequestV4.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountList, duration, language, maxTxHistory, psuId, responseType, scope, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecoupledAuthRequestV4 {\n");
    
    sb.append("    accountList: ").append(toIndentedString(accountList)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    maxTxHistory: ").append(toIndentedString(maxTxHistory)).append("\n");
    sb.append("    psuId: ").append(toIndentedString(psuId)).append("\n");
    sb.append("    responseType: ").append(toIndentedString(responseType)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
