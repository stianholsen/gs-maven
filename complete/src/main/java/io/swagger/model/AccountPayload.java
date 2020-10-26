package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AccountPayload
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-24T19:28:18.999418-04:00[America/New_York]")


public class AccountPayload   {
  @JsonProperty("account_id")
  private String accountId = null;

  @JsonProperty("account_number")
  private String accountNumber = null;

  /**
   * Gets or Sets currency
   */
  public enum CurrencyEnum {
    AED("AED"),
    
    AFN("AFN"),
    
    ALL("ALL"),
    
    AMD("AMD"),
    
    ANG("ANG"),
    
    AOA("AOA"),
    
    ARS("ARS"),
    
    AUD("AUD"),
    
    AWG("AWG"),
    
    AZN("AZN"),
    
    BAM("BAM"),
    
    BBD("BBD"),
    
    BDT("BDT"),
    
    BGN("BGN"),
    
    BHD("BHD"),
    
    BIF("BIF"),
    
    BMD("BMD"),
    
    BND("BND"),
    
    BOB("BOB"),
    
    BOV("BOV"),
    
    BRL("BRL"),
    
    BSD("BSD"),
    
    BTN("BTN"),
    
    BWP("BWP"),
    
    BYN("BYN"),
    
    BYR("BYR"),
    
    BZD("BZD"),
    
    CAD("CAD"),
    
    CDF("CDF"),
    
    CHE("CHE"),
    
    CHF("CHF"),
    
    CHW("CHW"),
    
    CLF("CLF"),
    
    CLP("CLP"),
    
    CNY("CNY"),
    
    COP("COP"),
    
    COU("COU"),
    
    CRC("CRC"),
    
    CUC("CUC"),
    
    CUP("CUP"),
    
    CVE("CVE"),
    
    CZK("CZK"),
    
    DJF("DJF"),
    
    DKK("DKK"),
    
    DOP("DOP"),
    
    DZD("DZD"),
    
    EGP("EGP"),
    
    ERN("ERN"),
    
    ETB("ETB"),
    
    EUR("EUR"),
    
    FJD("FJD"),
    
    FKP("FKP"),
    
    GBP("GBP"),
    
    GGP("GGP"),
    
    GEL("GEL"),
    
    GHS("GHS"),
    
    GIP("GIP"),
    
    GMD("GMD"),
    
    GNF("GNF"),
    
    GTQ("GTQ"),
    
    GYD("GYD"),
    
    HKD("HKD"),
    
    HNL("HNL"),
    
    HRK("HRK"),
    
    HTG("HTG"),
    
    HUF("HUF"),
    
    IDR("IDR"),
    
    ILS("ILS"),
    
    IMP("IMP"),
    
    INR("INR"),
    
    IQD("IQD"),
    
    IRR("IRR"),
    
    ISK("ISK"),
    
    JEP("JEP"),
    
    JMD("JMD"),
    
    JOD("JOD"),
    
    JPY("JPY"),
    
    KES("KES"),
    
    KGS("KGS"),
    
    KHR("KHR"),
    
    KMF("KMF"),
    
    KPW("KPW"),
    
    KRW("KRW"),
    
    KWD("KWD"),
    
    KYD("KYD"),
    
    KZT("KZT"),
    
    LAK("LAK"),
    
    LBP("LBP"),
    
    LKR("LKR"),
    
    LRD("LRD"),
    
    LSL("LSL"),
    
    LYD("LYD"),
    
    MAD("MAD"),
    
    MDL("MDL"),
    
    MGA("MGA"),
    
    MKD("MKD"),
    
    MMK("MMK"),
    
    MNT("MNT"),
    
    MOP("MOP"),
    
    MRU("MRU"),
    
    MUR("MUR"),
    
    MVR("MVR"),
    
    MWK("MWK"),
    
    MXN("MXN"),
    
    MXV("MXV"),
    
    MYR("MYR"),
    
    MZN("MZN"),
    
    NAD("NAD"),
    
    NGN("NGN"),
    
    NIO("NIO"),
    
    NOK("NOK"),
    
    NPR("NPR"),
    
    NZD("NZD"),
    
    OMR("OMR"),
    
    PAB("PAB"),
    
    PEN("PEN"),
    
    PGK("PGK"),
    
    PHP("PHP"),
    
    PKR("PKR"),
    
    PLN("PLN"),
    
    PYG("PYG"),
    
    QAR("QAR"),
    
    RON("RON"),
    
    RSD("RSD"),
    
    RUB("RUB"),
    
    RWF("RWF"),
    
    SAR("SAR"),
    
    SBD("SBD"),
    
    SCR("SCR"),
    
    SDG("SDG"),
    
    SEK("SEK"),
    
    SGD("SGD"),
    
    SHP("SHP"),
    
    SLL("SLL"),
    
    SOS("SOS"),
    
    SPL("SPL"),
    
    SRD("SRD"),
    
    SSP("SSP"),
    
    STN("STN"),
    
    SVC("SVC"),
    
    SYP("SYP"),
    
    SZL("SZL"),
    
    THB("THB"),
    
    TJS("TJS"),
    
    TMT("TMT"),
    
    TND("TND"),
    
    TOP("TOP"),
    
    TRY("TRY"),
    
    TTD("TTD"),
    
    TVD("TVD"),
    
    TWD("TWD"),
    
    TZS("TZS"),
    
    UAH("UAH"),
    
    UGX("UGX"),
    
    USD("USD"),
    
    USN("USN"),
    
    UYI("UYI"),
    
    UYU("UYU"),
    
    UZS("UZS"),
    
    VEF("VEF"),
    
    VND("VND"),
    
    VUV("VUV"),
    
    WST("WST"),
    
    XAF("XAF"),
    
    XAG("XAG"),
    
    XAU("XAU"),
    
    XBA("XBA"),
    
    XBB("XBB"),
    
    XBC("XBC"),
    
    XBD("XBD"),
    
    XCD("XCD"),
    
    XDR("XDR"),
    
    XOF("XOF"),
    
    XPD("XPD"),
    
    XPF("XPF"),
    
    XPT("XPT"),
    
    XSU("XSU"),
    
    XTS("XTS"),
    
    XUA("XUA"),
    
    XXX("XXX"),
    
    YER("YER"),
    
    ZAR("ZAR"),
    
    ZMW("ZMW"),
    
    ZWD("ZWD"),
    
    CHN("CHN"),
    
    EEK("EEK"),
    
    LVL("LVL"),
    
    MRO("MRO"),
    
    STD("STD"),
    
    TRL("TRL"),
    
    ZWL("ZWL");

    private String value;

    CurrencyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CurrencyEnum fromValue(String text) {
      for (CurrencyEnum b : CurrencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("currency")
  private CurrencyEnum currency = null;

  public AccountPayload accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(value = "")
  
    public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public AccountPayload accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
  **/
  @ApiModelProperty(value = "")
  
    public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public AccountPayload currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  
    public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountPayload accountPayload = (AccountPayload) o;
    return Objects.equals(this.accountId, accountPayload.accountId) &&
        Objects.equals(this.accountNumber, accountPayload.accountNumber) &&
        Objects.equals(this.currency, accountPayload.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountNumber, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPayload {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
