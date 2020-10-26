package io.swagger.api;

import io.swagger.model.AccessTokenResponse;
import io.swagger.model.AssetResponse;
import io.swagger.model.AuthCodeResponse;
import io.swagger.model.AuthorizeResponse;
import io.swagger.model.BearerToken;
import io.swagger.model.DecoupledAuthRequestV4;
import io.swagger.model.ErrorResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-24T19:28:18.999418-04:00[America/New_York]")
@Controller
public class V4ApiController implements V4Api {

    private static final Logger log = LoggerFactory.getLogger(V4ApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public V4ApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<BearerToken> accessTokenUsingPOST2(@ApiParam(value = "Standard http header element for date and time. HTTP headers are represented as RFC 7231 Full Dates. example date: Wed, 24 Apr 2019 14:00:37 EEST" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "The Digest Header header as defined in [RFC3230] contains a Hash of the message body. The only hash algorithms that may be used to calculate the Digest within the context of this specification are SHA-256 and SHA-512 as defined in [RFC5843].\"," ,required=true) @RequestHeader(value="Digest", required=true) String digest
,@ApiParam(value = "A signature of request by the TPP on application level. The process of signing a request is described in 'Signing HTTP Messages' RFC draft version 10 (https://tools.ietf.org/html/draft-cavage-http-signatures-10). The request signature needs to be sent in the 'Signature' HTTP header as described in the RFC. Additional requirements from Nordea   - The only allowed algorithm is RSA-SHA256  - The key size for the used RSA key pair has to be at least 2048 bit  - The keyId is the clientId of your application originating from the Nordea Developer Portal  - We require the following headers to be used in the signature  * GET request: (request-target) host date  * PUT and POST request: (request-target) host date content-type digest .  * The request-target is a combination of the HTTP action verb and the request URI path." ,required=true) @RequestHeader(value="Signature", required=true) String signature
,@ApiParam(value = "Id of the Client" ,required=true) @RequestHeader(value="X-IBM-Client-Id", required=true) String xIBMClientId
,@ApiParam(value = "Secret password generated for the Client" ,required=true) @RequestHeader(value="X-IBM-Client-Secret", required=true) String xIBMClientSecret
,@ApiParam(value = "End user (i.e. PSU) agent information, to be provided if TPP is in session with the PSU" ) @RequestHeader(value="X-Nordea-Originating-User-Agent", required=false) String xNordeaOriginatingUserAgent
,@ApiParam(value = "End user (i.e. PSU) IP address, to be provided if TPP is in session with the PSU" ) @RequestHeader(value="X-Nordea-Originating-User-Ip", required=false) String xNordeaOriginatingUserIp
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<BearerToken>(objectMapper.readValue("{\n  \"access_token\" : \"eyJjdHkiOiJKV1QiLCJlbmMiOiJBMTI4R0NNIiwiYWxnIjoiZGlyIn0..EM2YgJGre7OTIpmA.8GmpStB05uh4u_1wrEpyVCV_P5XwTcbL7zF_NsZJaMcZvo3B78gqhDR2lCCGLbTTImM4ILGHEQXO5Q7-obmdacIk9jcRr2eg5lTj_MBk9ch9yCMGh1NLEtXfOuHO1WzLoR6njQLDHdvvA2M3MEnVToqF6NdRI5f1hpWwC75TwUJWG50YTTYUBJskGPuRMLPfuTH-sncyVpI5Pj-XwXgcwOuXq8mz87DE1ZCCxPollReFZFsriQO3FeAqdgKigLaDH_WsoromxG2RAz6u4de-IYwXeWhsyq81SvOICE29kLMl9uxCvp6frYzOHoe7rfSaJiPhWGLn4_l29GimVNepQi1BadFqvHUyr7pUtO4Nx8e3piN7RV4DpMu1mf8_BYJaNUMyaeismu7RS9CmXm8wiEwgxK6f6vSOZxK6X8k7EHNKmZJZyR0q5ZRtFMzNa27tFah5_CybeJ86dJYIoaS1yG4rwBhokM06lVwAUAnpjXSRdoD7VUeNeg70DvTS2rtLa_w0_RLpva-iGkup-GIQyURK_jDZF2dVlRIanA8cwF6PZTA4cVslCd6EScJx9AHG87MmiWs6j0KOLZRyun3N3BEeRrjjcPk_lc3zcd8E2MZB4l-4o69cYvgAk1DpkxB__3IyuVkTEGwxlvT04anjsGLXEiunvQnDlAyEApr4xBeIGA2tAU8sstOQgGQffRj17iXWFgh4n5uHP77wrA4_d1tydAGCBhEVk6tsUVA81cavlwEfF53Yn1SK9bVofKv412tzU8fzNecni0IAsuWsCLGX.z3MMhpzmMp-GwdbTSl2rWQ\",\n  \"refresh_token\" : \"eyJjdHkiOiJKV1QiLCJlbmMiOiJBMjU2R0NNIiwiYWxnIjoiZGlyIn0..9IxfdEexBagh8deitsB4_pSVMs-y7OZ73k07MKTUufBOCUWpuBx3cRyPaGfMvwehEhefL2Ffi_FYhBb-StxF_m59aA2kqJimtSX0mr3Ogd5bLWNc2fXSEHPoKEJyzIVi-V-wjv6hBspUAk008Fq26tzvhjrBoswqUdqfmbksXED02fjMYYYP9Fcn7Jg3JO_AjEswxgqmWGsfhHIdNXrPPGpIfk7R0G0sehignbOjDraxCfYsYmp_6zxh5Ja2QDvsRlhAqdSRgX_I7kEpZFZbtJk-19mYMK7eOidTkLMPuhhg_7UcJSo5PjuFMhgvNJKx8UWiyRFlLAWCdo6CknQgJDGCGTiNCUoHywlZBYVmsPJlQITIOHgjvhQQa6Bk3xVs_r4gVfJiKqI4y96l6Tw9ydHJQrLw-4eJBdjisPpUZlrGgvP_WUYigVzco95kSQcT1WqBHhCMdGchPm0mEPD4BSpzHOvlIqmXaiGSwLC4YxQn_PfWWGGnbPvcfg8GJoX4iR6nv_Excn32mpUWlbl7lo-YD2c45oJVJVqFrADRqtQN-lR84cXmd75Gr7R7IJxgZnH8C6EfrBAiy_QEScsIOoDFESqAvUPCXj8FH9_cdWkeLsLSEkJwLOeLcTF73iXG7h_L_giz3t6zjNRa2WxErOxdYF0G453xQb4nFH1X9gc2jnSInmt1jiZGL3WSSXcCWjTSwQq3WhgVfjVTszMF_3F5NnSPHKuKpYf1Dc1kG_F0egzg2HIwTESZOr1jsmMjfyW42jotjc8JhbnjTU-dOgopCf5jWjzTeXFgdxgow7Am3NQa8R3wudqTQD7q5-ItMhW5mVt8TKk7IFjxd2r5tTJFiIsi8nyXOEujs4GuWtmL8gfqrulA7MgodN-FFXPGpa4KbLCGgO7dr5qY-eYLcg._OZAqZevjU4wIAe7D8aQfw\",\n  \"token_type\" : \"Bearer\",\n  \"expires_in\" : 3600\n}", BearerToken.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<BearerToken>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<BearerToken>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> authorizationV4FiDkNo(@NotNull @ApiParam(value = "client id issued to the TPP via the Developer Portal for the App in use", required = true) @Valid @RequestParam(value = "client_id", required = true) String clientId
,@NotNull @ApiParam(value = "Country is a mandatory parameter with possible values FI, DK or NO", required = true, allowableValues = "FI, DK, NO") @Valid @RequestParam(value = "country", required = true) String country
,@NotNull @ApiParam(value = "Duration of access authorization in minutes. range: 1 to 129600 minutes (90 days)", required = true) @Valid @RequestParam(value = "duration", required = true) Integer duration
,@NotNull @ApiParam(value = "Redirect URI you used when this application was registered with Nordea.", required = true) @Valid @RequestParam(value = "redirect_uri", required = true) String redirectUri
,@NotNull @ApiParam(value = "scope is a list of one or more of the scopes described below:  AIS scopes: - ACCOUNTS_BASIC (note: Must always be present at a minimum, when requesting ACCOUNTS_* scopes) - ACCOUNTS_BALANCES - ACCOUNTS_DETAILS - ACCOUNTS_TRANSACTIONS  PIS scope: - PAYMENTS_MULTIPLE", required = true) @Valid @RequestParam(value = "scope", required = true) List<String> scope
,@NotNull @ApiParam(value = "The OAuth2 state parameter", required = true) @Valid @RequestParam(value = "state", required = true) String state
,@ApiParam(value = "End user (i.e. PSU) agent information, to be provided if TPP is in session with the PSU" ) @RequestHeader(value="X-Nordea-Originating-User-Agent", required=false) String xNordeaOriginatingUserAgent
,@ApiParam(value = "End user (i.e. PSU) IP address, to be provided if TPP is in session with the PSU" ) @RequestHeader(value="X-Nordea-Originating-User-Ip", required=false) String xNordeaOriginatingUserIp
,@ApiParam(value = "Optional list of payment accounts for which the PSU has agreed access with the TPP. If not provided, PSU will select payment account(s) in the Nordea UI. Special case: passing 'ALL' results in the PSU agreeing access to all of their Nordea payment accounts.") @Valid @RequestParam(value = "account_list", required = false) List<String> accountList
,@ApiParam(value = "Parameter with possible values: NEMID_2F (DK only: NemID with username, password and OTC/NMAS), BANKID_NO (NO only: BankID Norway), BANKIDM_NO (NO only: Mobile BankID Norway)", allowableValues = "NEMID_2F, BANKID_NO, BANKIDM_NO") @Valid @RequestParam(value = "authentication_method", required = false) String authenticationMethod
,@ApiParam(value = "If country is FI, the default language is \"fi\", if country is DK, the default language is \"da\", if country is NO, the default language is \"no\"", allowableValues = "fi, da, sv, en, no") @Valid @RequestParam(value = "language", required = false) String language
,@ApiParam(value = "Optional if authentication_method is provided; not possible without authentication_method. Enables the Client to further streamline the authentication flow user experience.  If authentication_method=NEMID_2F, no login_hint is possible  If authentication_method=BANKID_NO, login_hint can be user ID  If authentication_method=BANKIDM_NO, login hint can be mobile number and date of birth, separated by ':'") @Valid @RequestParam(value = "login_hint", required = false) String loginHint
,@ApiParam(value = "Maximum transaction history in months. Optional if ACCOUNTS_TRANSACTIONS scope is requested. Default=12 months. range: 1 to 12 months") @Valid @RequestParam(value = "max_tx_history", required = false) Integer maxTxHistory
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AuthorizeResponse> authorizationV4Se(@ApiParam(value = "Standard http header element for date and time. HTTP headers are represented as RFC 7231 Full Dates. example date: Wed, 24 Apr 2019 14:00:37 EEST" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "The Digest Header header as defined in [RFC3230] contains a Hash of the message body. The only hash algorithms that may be used to calculate the Digest within the context of this specification are SHA-256 and SHA-512 as defined in [RFC5843].\"," ,required=true) @RequestHeader(value="Digest", required=true) String digest
,@ApiParam(value = "A signature of request by the TPP on application level. The process of signing a request is described in 'Signing HTTP Messages' RFC draft version 10 (https://tools.ietf.org/html/draft-cavage-http-signatures-10). The request signature needs to be sent in the 'Signature' HTTP header as described in the RFC. Additional requirements from Nordea   - The only allowed algorithm is RSA-SHA256  - The key size for the used RSA key pair has to be at least 2048 bit  - The keyId is the clientId of your application originating from the Nordea Developer Portal  - We require the following headers to be used in the signature  * GET request: (request-target) host date  * PUT and POST request: (request-target) host date content-type digest .  * The request-target is a combination of the HTTP action verb and the request URI path." ,required=true) @RequestHeader(value="Signature", required=true) String signature
,@ApiParam(value = "Id of the Client" ,required=true) @RequestHeader(value="X-IBM-Client-Id", required=true) String xIBMClientId
,@ApiParam(value = "Secret password generated for the Client" ,required=true) @RequestHeader(value="X-IBM-Client-Secret", required=true) String xIBMClientSecret
,@ApiParam(value = "Request for authorization" ,required=true )  @Valid @RequestBody DecoupledAuthRequestV4 body
,@ApiParam(value = "End user (i.e. PSU) agent information, to be provided if TPP is in session with the PSU" ) @RequestHeader(value="X-Nordea-Originating-User-Agent", required=false) String xNordeaOriginatingUserAgent
,@ApiParam(value = "End user (i.e. PSU) IP address, to be provided if TPP is in session with the PSU" ) @RequestHeader(value="X-Nordea-Originating-User-Ip", required=false) String xNordeaOriginatingUserIp
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuthorizeResponse>(objectMapper.readValue("{\n  \"group_header\" : {\n    \"http_code\" : 200,\n    \"message_pagination\" : {\n      \"continuation_key\" : \"continuation_key\"\n    },\n    \"message_identification\" : \"message_identification\",\n    \"creation_date_time\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"response\" : {\n    \"_links\" : [ { }, { } ],\n    \"order_ref\" : \"order_ref\",\n    \"tpp_token\" : \"tpp_token\",\n    \"status\" : \"status\"\n  }\n}", AuthorizeResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuthorizeResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuthorizeResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AssetResponse> getAssetsUsingGET2(@ApiParam(value = "Standard http header element for date and time. HTTP headers are represented as RFC 7231 Full Dates. example date: Wed, 24 Apr 2019 14:00:37 EEST" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "A signature of request by the TPP on application level. The process of signing a request is described in 'Signing HTTP Messages' RFC draft version 10 (https://tools.ietf.org/html/draft-cavage-http-signatures-10). The request signature needs to be sent in the 'Signature' HTTP header as described in the RFC. Additional requirements from Nordea   - The only allowed algorithm is RSA-SHA256  - The key size for the used RSA key pair has to be at least 2048 bit  - The keyId is the clientId of your application originating from the Nordea Developer Portal  - We require the following headers to be used in the signature  * GET request: (request-target) host date  * PUT and POST request: (request-target) host date content-type digest .  * The request-target is a combination of the HTTP action verb and the request URI path." ,required=true) @RequestHeader(value="Signature", required=true) String signature
,@ApiParam(value = "Id of the Client" ,required=true) @RequestHeader(value="X-IBM-Client-Id", required=true) String xIBMClientId
,@ApiParam(value = "Secret password generated for the Client" ,required=true) @RequestHeader(value="X-IBM-Client-Secret", required=true) String xIBMClientSecret
,@ApiParam(value = "End user (i.e. PSU) agent information, to be provided if TPP is in session with the PSU" ) @RequestHeader(value="X-Nordea-Originating-User-Agent", required=false) String xNordeaOriginatingUserAgent
,@ApiParam(value = "End user (i.e. PSU) IP address, to be provided if TPP is in session with the PSU" ) @RequestHeader(value="X-Nordea-Originating-User-Ip", required=false) String xNordeaOriginatingUserIp
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AssetResponse>(objectMapper.readValue("{\n  \"group_header\" : {\n    \"http_code\" : 200,\n    \"message_pagination\" : {\n      \"continuation_key\" : \"continuation_key\"\n    },\n    \"message_identification\" : \"message_identification\",\n    \"creation_date_time\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"response\" : {\n    \"accounts\" : [ {\n      \"account_number\" : \"account_number\",\n      \"account_id\" : \"account_id\",\n      \"currency\" : \"AED\"\n    }, {\n      \"account_number\" : \"account_number\",\n      \"account_id\" : \"account_id\",\n      \"currency\" : \"AED\"\n    } ],\n    \"scopes\" : [ \"ACCOUNTS_BASIC\", \"ACCOUNTS_BASIC\" ]\n  }\n}", AssetResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AssetResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AssetResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AuthCodeResponse> getStatusUsingGET2(@ApiParam(value = "Standard http header element for date and time. HTTP headers are represented as RFC 7231 Full Dates. example date: Wed, 24 Apr 2019 14:00:37 EEST" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "A signature of request by the TPP on application level. The process of signing a request is described in 'Signing HTTP Messages' RFC draft version 10 (https://tools.ietf.org/html/draft-cavage-http-signatures-10). The request signature needs to be sent in the 'Signature' HTTP header as described in the RFC. Additional requirements from Nordea   - The only allowed algorithm is RSA-SHA256  - The key size for the used RSA key pair has to be at least 2048 bit  - The keyId is the clientId of your application originating from the Nordea Developer Portal  - We require the following headers to be used in the signature  * GET request: (request-target) host date  * PUT and POST request: (request-target) host date content-type digest .  * The request-target is a combination of the HTTP action verb and the request URI path." ,required=true) @RequestHeader(value="Signature", required=true) String signature
,@ApiParam(value = "Id of the Client" ,required=true) @RequestHeader(value="X-IBM-Client-Id", required=true) String xIBMClientId
,@ApiParam(value = "Secret password generated for the Client" ,required=true) @RequestHeader(value="X-IBM-Client-Secret", required=true) String xIBMClientSecret
,@ApiParam(value = "Order reference uuid",required=true) @PathVariable("orderRef") String orderRef
,@ApiParam(value = "End user (i.e. PSU) agent information, to be provided if TPP is in session with the PSU" ) @RequestHeader(value="X-Nordea-Originating-User-Agent", required=false) String xNordeaOriginatingUserAgent
,@ApiParam(value = "End user (i.e. PSU) IP address, to be provided if TPP is in session with the PSU" ) @RequestHeader(value="X-Nordea-Originating-User-Ip", required=false) String xNordeaOriginatingUserIp
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AuthCodeResponse>(objectMapper.readValue("{\n  \"group_header\" : {\n    \"http_code\" : 200,\n    \"message_pagination\" : {\n      \"continuation_key\" : \"continuation_key\"\n    },\n    \"message_identification\" : \"message_identification\",\n    \"creation_date_time\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"response\" : {\n    \"code\" : \"code\",\n    \"_links\" : [ { }, { } ],\n    \"state\" : \"state\"\n  }\n}", AuthCodeResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AuthCodeResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AuthCodeResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<AccessTokenResponse> getTokenUsingPOST2(@ApiParam(value = "Standard http header element for date and time. HTTP headers are represented as RFC 7231 Full Dates. example date: Wed, 24 Apr 2019 14:00:37 EEST" ,required=true) @RequestHeader(value="Date", required=true) String date
,@ApiParam(value = "The Digest Header header as defined in [RFC3230] contains a Hash of the message body. The only hash algorithms that may be used to calculate the Digest within the context of this specification are SHA-256 and SHA-512 as defined in [RFC5843].\"," ,required=true) @RequestHeader(value="Digest", required=true) String digest
,@ApiParam(value = "A signature of request by the TPP on application level. The process of signing a request is described in 'Signing HTTP Messages' RFC draft version 10 (https://tools.ietf.org/html/draft-cavage-http-signatures-10). The request signature needs to be sent in the 'Signature' HTTP header as described in the RFC. Additional requirements from Nordea   - The only allowed algorithm is RSA-SHA256  - The key size for the used RSA key pair has to be at least 2048 bit  - The keyId is the clientId of your application originating from the Nordea Developer Portal  - We require the following headers to be used in the signature  * GET request: (request-target) host date  * PUT and POST request: (request-target) host date content-type digest .  * The request-target is a combination of the HTTP action verb and the request URI path." ,required=true) @RequestHeader(value="Signature", required=true) String signature
,@ApiParam(value = "Id of the Client" ,required=true) @RequestHeader(value="X-IBM-Client-Id", required=true) String xIBMClientId
,@ApiParam(value = "Secret password generated for the Client" ,required=true) @RequestHeader(value="X-IBM-Client-Secret", required=true) String xIBMClientSecret
,@ApiParam(value = "End user (i.e. PSU) agent information, to be provided if TPP is in session with the PSU" ) @RequestHeader(value="X-Nordea-Originating-User-Agent", required=false) String xNordeaOriginatingUserAgent
,@ApiParam(value = "End user (i.e. PSU) IP address, to be provided if TPP is in session with the PSU" ) @RequestHeader(value="X-Nordea-Originating-User-Ip", required=false) String xNordeaOriginatingUserIp
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<AccessTokenResponse>(objectMapper.readValue("{\n  \"group_header\" : {\n    \"http_code\" : 200,\n    \"message_pagination\" : {\n      \"continuation_key\" : \"continuation_key\"\n    },\n    \"message_identification\" : \"message_identification\",\n    \"creation_date_time\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"response\" : {\n    \"access_token\" : \"eyJjdHkiOiJKV1QiLCJlbmMiOiJBMTI4R0NNIiwiYWxnIjoiZGlyIn0..EM2YgJGre7OTIpmA.8GmpStB05uh4u_1wrEpyVCV_P5XwTcbL7zF_NsZJaMcZvo3B78gqhDR2lCCGLbTTImM4ILGHEQXO5Q7-obmdacIk9jcRr2eg5lTj_MBk9ch9yCMGh1NLEtXfOuHO1WzLoR6njQLDHdvvA2M3MEnVToqF6NdRI5f1hpWwC75TwUJWG50YTTYUBJskGPuRMLPfuTH-sncyVpI5Pj-XwXgcwOuXq8mz87DE1ZCCxPollReFZFsriQO3FeAqdgKigLaDH_WsoromxG2RAz6u4de-IYwXeWhsyq81SvOICE29kLMl9uxCvp6frYzOHoe7rfSaJiPhWGLn4_l29GimVNepQi1BadFqvHUyr7pUtO4Nx8e3piN7RV4DpMu1mf8_BYJaNUMyaeismu7RS9CmXm8wiEwgxK6f6vSOZxK6X8k7EHNKmZJZyR0q5ZRtFMzNa27tFah5_CybeJ86dJYIoaS1yG4rwBhokM06lVwAUAnpjXSRdoD7VUeNeg70DvTS2rtLa_w0_RLpva-iGkup-GIQyURK_jDZF2dVlRIanA8cwF6PZTA4cVslCd6EScJx9AHG87MmiWs6j0KOLZRyun3N3BEeRrjjcPk_lc3zcd8E2MZB4l-4o69cYvgAk1DpkxB__3IyuVkTEGwxlvT04anjsGLXEiunvQnDlAyEApr4xBeIGA2tAU8sstOQgGQffRj17iXWFgh4n5uHP77wrA4_d1tydAGCBhEVk6tsUVA81cavlwEfF53Yn1SK9bVofKv412tzU8fzNecni0IAsuWsCLGX.z3MMhpzmMp-GwdbTSl2rWQ\",\n    \"refresh_token\" : \"eyJjdHkiOiJKV1QiLCJlbmMiOiJBMjU2R0NNIiwiYWxnIjoiZGlyIn0..9IxfdEexBagh8deitsB4_pSVMs-y7OZ73k07MKTUufBOCUWpuBx3cRyPaGfMvwehEhefL2Ffi_FYhBb-StxF_m59aA2kqJimtSX0mr3Ogd5bLWNc2fXSEHPoKEJyzIVi-V-wjv6hBspUAk008Fq26tzvhjrBoswqUdqfmbksXED02fjMYYYP9Fcn7Jg3JO_AjEswxgqmWGsfhHIdNXrPPGpIfk7R0G0sehignbOjDraxCfYsYmp_6zxh5Ja2QDvsRlhAqdSRgX_I7kEpZFZbtJk-19mYMK7eOidTkLMPuhhg_7UcJSo5PjuFMhgvNJKx8UWiyRFlLAWCdo6CknQgJDGCGTiNCUoHywlZBYVmsPJlQITIOHgjvhQQa6Bk3xVs_r4gVfJiKqI4y96l6Tw9ydHJQrLw-4eJBdjisPpUZlrGgvP_WUYigVzco95kSQcT1WqBHhCMdGchPm0mEPD4BSpzHOvlIqmXaiGSwLC4YxQn_PfWWGGnbPvcfg8GJoX4iR6nv_Excn32mpUWlbl7lo-YD2c45oJVJVqFrADRqtQN-lR84cXmd75Gr7R7IJxgZnH8C6EfrBAiy_QEScsIOoDFESqAvUPCXj8FH9_cdWkeLsLSEkJwLOeLcTF73iXG7h_L_giz3t6zjNRa2WxErOxdYF0G453xQb4nFH1X9gc2jnSInmt1jiZGL3WSSXcCWjTSwQq3WhgVfjVTszMF_3F5NnSPHKuKpYf1Dc1kG_F0egzg2HIwTESZOr1jsmMjfyW42jotjc8JhbnjTU-dOgopCf5jWjzTeXFgdxgow7Am3NQa8R3wudqTQD7q5-ItMhW5mVt8TKk7IFjxd2r5tTJFiIsi8nyXOEujs4GuWtmL8gfqrulA7MgodN-FFXPGpa4KbLCGgO7dr5qY-eYLcg._OZAqZevjU4wIAe7D8aQfw\",\n    \"token_type\" : \"Bearer\",\n    \"expires_in\" : 3600\n  }\n}", AccessTokenResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<AccessTokenResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<AccessTokenResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
