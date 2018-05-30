package com.example.user.jhotel_android_derni;

/**
 * Created by Derni Ageng on 5/28/2018.
 */
import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;
import com.android.volley.Response;

public class PesananFetchRequest extends StringRequest {
    private static final String Regis_URL = "http://192.168.0.100:8080/pesanancustomer/";
    private Map<String, String> params;

    public PesananFetchRequest(String id_customer, Response.Listener<String> listener) {
        super(Method.GET, Regis_URL+id_customer, listener, null);
        params = new HashMap<>();
    }
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
