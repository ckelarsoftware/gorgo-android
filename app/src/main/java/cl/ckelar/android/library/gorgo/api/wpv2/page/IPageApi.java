package cl.ckelar.android.library.gorgo.api.wpv2.page;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IPageApi {
    @GET("wp-json/wp/v2/pages")
    Call<ResponseBody> getPageBySlug(@Query("slug") String slug, @Query("_embed") String _embed);
}
