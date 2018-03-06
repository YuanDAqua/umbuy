package project.team6.umbuy.persistence;

import java.util.List;

import project.team6.umbuy.data_model.Advertisement;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/*fill the () after @GET @POST @DELETE with corresponding path after host url*/
public interface ApiInterface {
    @GET("/ads")
    Call<List<Advertisement>> getAllAdvertisements();

    @POST("/createAd")
    @FormUrlEncoded
    Call<Advertisement> submitAd(@Field("advertisementId") int advertisementId,
                                 @Field("title") String title,
                                 @Field("userId") String userId,
                                 @Field("description") String description,
                                 @Field("price") double price,
                                 @Field("imageUrl") String imageUrl,
                                 @Field("category") String category);
}