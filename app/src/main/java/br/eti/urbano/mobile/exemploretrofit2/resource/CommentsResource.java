package br.eti.urbano.mobile.exemploretrofit2.resource;

import java.util.List;

import br.eti.urbano.mobile.exemploretrofit2.model.Comments;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface CommentsResource {

    @GET("/comments")
    Call<List<Comments>> get();

    @GET("/comments/{id}")
    Call<Comments> get(Integer id);

    @POST("/comments")
    Call<Comments> post(@Body Comments comments);

    @PUT("/comments/{id}")
    Call<Comments> put(@Body Comments comments);

    @DELETE("/comments/{id}")
    Call<Void> delete(Integer id);

    @PATCH("/comments/{id}")
    Call<Comments> patch(Integer id, @Body Comments comments);


}