package com.Sayantan.newsappcompose.di

import com.Sayantan.newsappcompose.BuildConfig
import com.Sayantan.newsappcompose.models.ApiKey
import com.Sayantan.newsappcompose.network.RetrofitApiInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    fun providesApiService() = Retrofit.Builder().baseUrl(com.Sayantan.newsappcompose.BuildConfig.BASE_URL).client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create()).build().create(RetrofitApiInterface::class.java)

    @Provides
    fun providesApiKey() = ApiKey(BuildConfig.API_KEY)
}