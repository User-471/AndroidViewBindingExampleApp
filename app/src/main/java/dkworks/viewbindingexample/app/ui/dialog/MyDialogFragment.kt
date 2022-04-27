package dkworks.viewbindingexample.app.ui.dialog

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import dkwokrs.viewbindingexample.app.R
import dkwokrs.viewbindingexample.app.databinding.FragmentMyDialogBinding
import dkworks.viewbindingexample.app.ui.base.BaseDialogFragment

class MyDialogFragment(val message: String) : BaseDialogFragment<FragmentMyDialogBinding>(FragmentMyDialogBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setStyle(DialogFragment.STYLE_NORMAL, R.style.FullScreenDialogStyle)
    }

    override fun onStart() {
        super.onStart()

        if (dialog != null) {
            val width = ViewGroup.LayoutParams.MATCH_PARENT
            val height = ViewGroup.LayoutParams.MATCH_PARENT
            dialog?.window?.setLayout(width, height)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setOnClickListeners()
        setData()
    }

    private fun setData() {
        binding.tvTitle.text = message
    }

    private fun setOnClickListeners() {
        binding.bOk.setOnClickListener {
            onOkClicked()
        }
    }

    private fun onOkClicked() {
        this.dismiss()
    }
}