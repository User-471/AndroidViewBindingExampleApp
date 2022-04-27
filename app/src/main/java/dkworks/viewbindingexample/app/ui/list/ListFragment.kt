package dkworks.viewbindingexample.app.ui.list

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import dkwokrs.viewbindingexample.app.databinding.FragmentListBinding
import dkworks.viewbindingexample.app.model.ListItemModel
import dkworks.viewbindingexample.app.ui.base.BaseFragment
import dkworks.viewbindingexample.app.ui.dialog.MyDialogFragment
import dkworks.viewbindingexample.app.ui.list.adapter.ListAdapter
import dkworks.viewbindingexample.app.utils.Constants
import dkworks.viewbindingexample.app.utils.getListItems

class ListFragment : BaseFragment<FragmentListBinding>(FragmentListBinding::inflate) {

    private var adapter: ListAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecycler()
    }

    private fun initRecycler() {
        adapter =
            ListAdapter(
                arrayListOf()
            ) { onItemClicked(it) }

        val manager = LinearLayoutManager(requireActivity())
        binding.rvItems.layoutManager = manager
        binding.rvItems.adapter = adapter

        adapter?.updateData(ArrayList(getListItems().shuffled()))
    }

    private fun onItemClicked(listItemModel: ListItemModel) {
        MyDialogFragment(listItemModel.title).show(childFragmentManager, Constants.Tags.TAG_MY_DIALOG)
    }
}