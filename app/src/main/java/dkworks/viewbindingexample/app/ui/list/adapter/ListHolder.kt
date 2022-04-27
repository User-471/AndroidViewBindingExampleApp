package dkworks.viewbindingexample.app.ui.list.adapter

import androidx.recyclerview.widget.RecyclerView
import dkwokrs.viewbindingexample.app.databinding.ItemListItemBinding
import dkworks.viewbindingexample.app.model.ListItemModel

class ListHolder(private val binding: ItemListItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(
        data: ListItemModel,
        onSwitchClickListener: (ListItemModel) -> Unit
    ) {
        binding.root.setOnClickListener { onSwitchClickListener(data) }

        binding.tvTitle.text = data.title
    }
}