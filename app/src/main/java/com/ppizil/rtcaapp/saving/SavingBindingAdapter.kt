package com.ppizil.rtcaapp.saving

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.view.forEachIndexed
import androidx.core.widget.doOnTextChanged
import androidx.databinding.BindingAdapter
import com.ppizil.rtcaapp.R
import com.ppizil.rtcaapp.databinding.ComponentSavingEdittextBinding
import com.ppizil.rtcaapp.main.setMainSavingAdapter
import com.ppizil.rtcaapp.utils.makeLog


@BindingAdapter("bind:onActionPlusBtn")
fun onActionPlusBtn(imageView: ImageView, savingViewModel: SavingViewModel?) {
    savingViewModel ?: return
    imageView.setOnClickListener {
        try {

            val parentViewGroup = (imageView.parent as ViewGroup)
            parentViewGroup.run {
                findViewById<LinearLayout>(R.id.lv_group)?.let { viewGroup ->
                    createPeopleNameView(viewGroup, savingViewModel).run {
                        savingViewModel.onClickPeplePlus()
                        viewGroup.addView(this)
                    }
                }
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
            onChangeUserName(etName, savingViewModel)
        }.root
}

@BindingAdapter("bind:onClickDeleteBtn")
fun onClickDeleteBtn(imageView: ImageView, viewModel: SavingViewModel?) {
    viewModel ?: return
    imageView.setOnClickListener {
        (imageView.parent as ViewGroup).let { rootView ->
            val rootContainerViewGrouop = rootView.parent as ViewGroup
            val childPos = rootContainerViewGrouop.indexOfChild(rootView)
            rootContainerViewGrouop.removeView(rootView)
            viewModel.onClickDeletePeople(childPos)
        }
    }
}

@BindingAdapter("bind:onChangeGroupName")
fun onChangeGroupName(editText: EditText, viewModel: SavingViewModel?) {
    viewModel ?: return


    editText.doOnTextChanged { text, _, _, _ ->
        viewModel.inputGroupName(text.toString())
    }
}

@BindingAdapter("bind:onChangeTotalMoney")
fun onChangeTotalMoney(editText: EditText, viewModel: SavingViewModel?) {
    viewModel ?: return

    editText.doOnTextChanged { text, _, _, _ ->
        viewModel.inputTotalMoney(text.toString())
    }
}

fun onChangeUserName(editText: EditText, viewModel: SavingViewModel) {



    editText.doOnTextChanged { text, _, _, _ ->
        val parentViewGroup = editText.parent as ViewGroup
        val parentLinearLayout = parentViewGroup.parent as ViewGroup
        val currentFieldPosition = parentLinearLayout.indexOfChild(parentViewGroup)
        viewModel.inputUserName(text.toString(), currentFieldPosition)
    }
}