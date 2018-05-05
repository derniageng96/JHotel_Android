package com.example.user.jhotel_android_derni;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

/**
 * Created by Derni Ageng on 5/3/2018.
 */


public class MenuRequest extends StringRequest {
    private static final String Menu_URL = "http://192.168.1.100:8080/vacantrooms";

    public MenuRequest(Response.Listener<String> listener) {
        super(Method.GET, Menu_URL, listener, null);
    }
}
