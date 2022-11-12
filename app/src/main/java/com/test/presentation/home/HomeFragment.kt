package com.test.presentation.home

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.fragment.app.viewModels
import com.test.R
import com.test.databinding.FragmentHomeBinding
import com.test.presentation.base.BaseFragment
import com.test.util.SnackbarMessage
import com.test.util.SnackbarUtils
import dagger.hilt.android.AndroidEntryPoint
import java.util.*

@AndroidEntryPoint
class HomeFragment : BaseFragment<HomeViewModel, FragmentHomeBinding>() {
    override var title: String = "Home"
    override var menuId: Int = 0
    override val toolBarId: Int = 0
    override val layoutId: Int = R.layout.fragment_home
    override val progressBar: ProgressBar? = null
    override val viewModel: HomeViewModel by viewModels()

    private val mListAdapter: HomeAdapter? by lazy { HomeAdapter(ArrayList(0)) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewmodel = viewModel

        with(viewModel) {
            start()

            mSnackbarText.observe(viewLifecycleOwner, object : SnackbarMessage.SnackbarObserver {

                override fun onNewMessage(snackbarMessageResourceId: Int) {
                    SnackbarUtils.showSnackbar(view, getString(snackbarMessageResourceId))
                }
            })
        }
        binding.recyclerFragmentMain.adapter = mListAdapter
        binding.recyclerFragmentMain.hasFixedSize()
    }
}