package cl.ckelar.android.library.gorgo.api.wpv2.page.impl;

import android.util.Log;

import com.google.gson.Gson;

import java.util.concurrent.TimeUnit;

import cl.ckelar.android.library.gorgo.api.wpv2.page.IPageApi;
import cl.ckelar.android.library.gorgo.dto.wpv2.pages.Page;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;

/**
 * Esta clase contiene funciones que permiten obtener datos de páginas de un sitio web Wordpress
 *
 * @version 1.0.0
 * @author Gerson Díaz
 * **/
public class PageApi {

    private static final String TAG = PageApi.class.getClass().getName();

    /**
     * Esta función permite obtener los datos de una página de Wordpress
     *
     * @param urlBase esta es la url base del sitio web, por ejemplo ("https://www.ckelar.cl/")
     * @param slug slug de la página que deseamos consultar
     * @param _embed Este parámetro permite obtener la información embebida de la página para tener información completa
     *
     * @see Page
     *
     * @exception Exception
     *
     * @return Page
     * **/
    public Page getPageBySlug(String urlBase, String slug, String _embed) throws Exception {
        Page page;

        try {

            Log.i(TAG, "--- METHOD: getPageBySlug ---");

            Log.d(TAG, "URL API: " + urlBase);     // Debug

            OkHttpClient.Builder b = new OkHttpClient.Builder();
            b.readTimeout(30, TimeUnit.SECONDS);
            b.writeTimeout(30, TimeUnit.SECONDS);
            b.connectTimeout(30, TimeUnit.SECONDS);
            OkHttpClient client = b.build();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(urlBase)
                    .client(client)
                    .build();
            IPageApi iPagesApi = retrofit.create(IPageApi.class);

            Call<ResponseBody> call = iPagesApi.getPageBySlug(slug, _embed);
            retrofit2.Response<ResponseBody> responseBody = call.execute();

            if (responseBody.isSuccessful()) {

                Log.i(TAG, "--- Obtiene la página ---");

                try {

                    String response = responseBody.body().string();
                    response = response.substring(1, response.length()-1);

                    Log.d(TAG, response);   // Debug

                    Gson gson = new Gson();

                    page = gson.fromJson(response, Page.class);

                    Log.i(TAG, "--- Decodifica el JSON Page ---");

                }
                catch (Exception ex) {
                    Log.e(TAG, "--- ERROR al decodificar el JSON Page ---");
                    Log.e(TAG, ex.toString());
                    page = null;
                    throw new Exception(ex);
                }

            } else {

                Log.e(TAG, "--- ERROR al consultar el Servicio ---");
                page = null;

            }

        } catch (Exception e) {

            Log.e(TAG, "--- ERROR al consultar la página ---");
            Log.e(TAG, e.toString());
            page = null;
            throw new Exception(e);
        }

        return page;
    }
}
