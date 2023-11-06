package com.Sayantan.newsappcompose.di

import com.Sayantan.newsappcompose.repo.RemoteDS
import com.Sayantan.newsappcompose.repo.RemoteDSImpl
import com.Sayantan.newsappcompose.repo.Repo
import com.Sayantan.newsappcompose.repo.RepoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepoModule {
    @Binds
    abstract fun bindRemoteDS(remoteDsImpl: RemoteDSImpl): RemoteDS

    @Binds
    abstract fun bindRepo(repoImpl: RepoImpl): Repo
}