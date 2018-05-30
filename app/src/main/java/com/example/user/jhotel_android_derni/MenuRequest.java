package com.example.user.jhotel_android_derni;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.Request;
import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;
import com.android.volley.Response;

/**
 * Created by Derni Ageng on 5/3/2018.
 */

public class MenuRequest extends StringRequest{
    private static final String Regis_URL = "http://192.168.0.100:8080/vacantrooms";
    private Map<String, String> params;

    public MenuRequest(Response.Listener<String> listener) {
        super(Request.Method.GET, Regis_URL, listener, null);
        params = new HashMap<>();
    }
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}