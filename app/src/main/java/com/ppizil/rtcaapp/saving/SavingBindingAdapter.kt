package com.ppizil.rtcaapp.saving

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.ppizil.rtcaapp.R
import com.ppizil.rtcaapp.databinding.ComponentSavingEdittextBinding
import com.ppizil.rtcaapp.utils.makeLog


@BindingAdapter("bind:onActionPlusBtn")
fun onActionPlusBtn(imageView: ImageView, savingViewModel: SavingViewModel?) {
    savingViewModel ?: return
    imageView.setOnClickListener {
        try {
            val count = savingViewModel.peopleCount()
            val parentViewGroup = (imageView.parent as ViewGroup)
            parentViewGroup.run {
                findViewById<LinearLayout>(R.id.lv_group)?.let { viewGroup ->
                    createPeopleNameView(viewGroup, savingViewModel).run {
                        this.tag = "${(count - 1)}"
                        viewGroup.addView(this)
                        savingViewModel.onClickPeplePlus()
                    }
                }
//            findViewById<TextView>(R.id.tv_people_count)?.let {
//                it.text = "${count}명"
//            }
            }
        } catch (e: Exception) {
            e.localizedMessage.makeLog(null)
        }
    }

}

fun createPeopleNameView(parentView: ViewGroup, savingViewModel: SavingViewModel): View {
    val context = parentView.context
    return ComponentSavingEdittextBinding
        .inflate(
            LayoutInflater.from(context),
            parentView,
            false
        ).apply {
            this.viewModel = savingViewModel
        }.root
}

@BindingAdapter("bind:onClickDeleteBtn")
fun onClickDeleteBtn(imageView: ImageView, viewModel: SavingViewModel?) {
    viewModel ?: return
    imageView.setOnClickListener {
        (imageView.parent as ViewGroup).let { rootView ->
            rootView.tag?.toString()?.toInt()?.let {
                viewModel.onClickDeletePeople(it)
                val rootContainerViewGrouop = rootView.parent as ViewGroup
                rootContainerViewGrouop.removeView(rootView)
            }
        }
    }
}