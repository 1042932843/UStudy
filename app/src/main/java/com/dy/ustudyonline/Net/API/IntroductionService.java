package com.dy.ustudyonline.Net.API;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Name: LoginRegisterService
 * Author: Dusky
 * QQ: 1042932843
 * Comment: //TODO
 * Date: 2017-09-30 16:33
 */

public interface IntroductionService {

    @POST("appCourse/courseAbout.xhtml")
    @FormUrlEncoded
    Observable<ResponseBody> courseAbout(@Field("userId") String userId,
                                           @Field("courseTerraceId") String deviceType);
    @POST("appCourse/choseCoursePage.xhtml")
    @FormUrlEncoded
    Observable<ResponseBody> choseCoursePage(@Field("userId") String userId,
                                         @Field("courseTerraceId") String deviceType);

    @POST("appPlayVideo/playTest.xhtml")
    @FormUrlEncoded
    Observable<ResponseBody> playTest(@Field("courseTerraceId") String deviceType);
}
