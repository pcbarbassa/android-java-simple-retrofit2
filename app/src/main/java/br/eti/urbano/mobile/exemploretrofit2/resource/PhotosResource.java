package br.eti.urbano.mobile.exemploretrofit2.resource;

import java.util.List;

import br.eti.urbano.mobile.exemploretrofit2.model.Photos;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;

public interface PhotosResource {

    @GET("/posts")
    Call<List<Photos>> get();

    @GET("/posts/{id}")
    Call<Photos> get(Integer id);

    @POST("/posts")
    Call<Photos> post(@Body Photos post);

    @PUT("/posts/{id}")
    Call<Photos> put(@Body Photos post);

    @DELETE("/posts/{id}")
    Call<Void> delete(Integer id);

    @PATCH("/posts/{id}")
    Call<Photos> patch(Integer id, @Body Photos post);

}