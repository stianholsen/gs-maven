package hello;
import models.auth.*;

import java.net.*;
import java.io.*;
import java.lang.Object;
import org.json.JSONObject;
import java.util.*;
import org.json.HTTP;

public class StartAuth {

	public static String getParamsString(Map<String, String> params) throws UnsupportedEncodingException {
        StringBuilder result = new StringBuilder();

        for (Map.Entry<String, String> entry : params.entrySet()) {
            result.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            result.append("=");
            result.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            result.append("&");
        }

        String resultString = result.toString();
        return resultString.length() > 0 ? resultString.substring(0, resultString.length() - 1) : resultString;
    }

	public String generateAccessToken(){

		return "hoho";
	}
}
