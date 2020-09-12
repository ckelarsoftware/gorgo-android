package cl.ckelar.android.library.gorgo.api.wpv2.posts;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IPostsApi {
    @GET("wp-json/wp/v2/posts")
    Call<ResponseBody> getPosts(@Query("page") int page,
                                @Query("per_page") int per_page,
                                @Query("orderby") String orderby,
                                @Query("_embed") String _embed
    );
}
