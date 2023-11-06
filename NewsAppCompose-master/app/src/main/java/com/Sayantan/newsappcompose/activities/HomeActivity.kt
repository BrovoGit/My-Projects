package com.Sayantan.newsappcompose.activities

import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import com.Sayantan.newsappcompose.states.HomeState
import com.Sayantan.newsappcompose.ui.screen.HomeScreen
import com.Sayantan.newsappcompose.viewmodels.HomeVM
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : BaseActivity<HomeVM, HomeState>() {
    override val viewModel: HomeVM by viewModels()

    @Composable
    override fun Content() {
        HomeScreen(viewModel)
    }
}