package com.example.user.jhotel_android_derni;

/**
 * Created by Derni Ageng on 5/28/2018.
 */
import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;
import com.android.volley.Response;

public class PesananRequest extends StringRequest {
    private static final String Regis_URL = "http://192.168.0.100:8080/bookpesanan";
    private Map<String, String> params;

    public PesananRequest(String jumlah_hari, String id_customer, String id_hotel, String nomor_kamar,  Response.Listener<String> listener) {
        super(Method.POST, Regis_URL, listener, null);
        params = new HashMap<>();
        params.put("jumlah_hari", jumlah_hari);
        params.put("id_customer",id_customer);
        params.put("id_hotel", id_hotel);
        params.put("nomor_kamar", nomor_kamar);

    }
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
