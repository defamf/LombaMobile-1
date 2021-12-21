package io.github.aerhakim.lombamobile.api;




import io.github.aerhakim.lombamobile.model.GetAgenda;
import io.github.aerhakim.lombamobile.model.GetNotifikasi;
import io.github.aerhakim.lombamobile.model.GetToken;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Api {

    @GET("lmagenda.php")
    Call<GetAgenda> agenda();

    @GET("lmnotifikasi.php")
    Call<GetNotifikasi> notifikasi();

    @FormUrlEncoded
    @POST("token.php")
    Call<GetToken> register(
            @Field("token") String token
    );

}
