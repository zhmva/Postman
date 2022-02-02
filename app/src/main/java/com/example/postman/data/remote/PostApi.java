package com.example.postman.data.remote;

import com.example.postman.data.models.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PostApi {

    @GET("/posts")
  //  @GET("/posts/{id}")
    Call<List<Post>> getPosts();
      //  @Path("id") int id
      //  @Query("id") int id

    @POST("/posts")
    Call<Post> createPost(
            @Body Post post
    );
}
