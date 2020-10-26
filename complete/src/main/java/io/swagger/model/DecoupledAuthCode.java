package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Link;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DecoupledAuthCode
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-24T19:28:18.999418-04:00[America/New_York]")


public class DecoupledAuthCode   {
  @JsonProperty("_links")
  @Valid
  private List<Link> _links = null;

  @JsonProperty("code")
  private String code = null;

  @JsonProperty("state")
  private String state = null;

  public DecoupledAuthCode _links(List<Link> _links) {
    this._links = _links;
    return this;
  }

  public DecoupledAuthCode addLinksItem(Link _linksItem) {
    if (this._links == null) {
      this._links = new ArrayList<Link>();
    }
    this._links.add(_linksItem);
    return this;
  }

  /**
   * Get _links
   * @return _links
  **/
  @ApiModelProperty(value = "")
      @Valid
    public List<Link> getLinks() {
    return _links;
  }

  public void setLinks(List<Link> _links) {
    this._links = _links;
  }

  public DecoupledAuthCode code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public DecoupledAuthCode state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(required = true, value = "")
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
    DecoupledAuthCode decoupledAuthCode = (DecoupledAuthCode) o;
    return Objects.equals(this._links, decoupledAuthCode._links) &&
        Objects.equals(this.code, decoupledAuthCode.code) &&
        Objects.equals(this.state, decoupledAuthCode.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_links, code, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecoupledAuthCode {\n");
    
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
