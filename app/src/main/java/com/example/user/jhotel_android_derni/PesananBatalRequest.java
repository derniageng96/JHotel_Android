package com.example.user.jhotel_android_derni;

/**
 * Created by Derni Ageng on 5/28/2018.
 */

import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;
import com.android.volley.Response;

public class PesananBatalRequest extends StringRequest {
    private static final String Regis_URL = "http://192.168.0.100:8080/cancelpesanan";
    private Map<String, String> params;

    public PesananBatalRequest(String id_pesanan, Response.Listener<String> listener) {
        super(Method.POST, Regis_URL, listener, null);
        params = new HashMap<>();
        params.put("id_pesanan",id_pesanan);
    }
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}

