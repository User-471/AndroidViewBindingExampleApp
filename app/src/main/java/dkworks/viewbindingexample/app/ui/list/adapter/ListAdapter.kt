package dkworks.viewbindingexample.app.ui.list.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dkwokrs.viewbindingexample.app.databinding.ItemListItemBinding
import dkworks.viewbindingexample.app.model.ListItemModel

class ListAdapter(
    var list: ArrayList<ListItemModel>,
    val onItemClickListener: (ListItemModel) -> Unit
) : RecyclerView.Adapter<ListHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {
        val itemBinding = ItemListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListHolder(itemBinding)
    }

    override fun getItemCount(): Int = list.size
    override fun onBindViewHolder(holder: ListHolder, position: Int) =
        holder.bind(list[position], onItemClickListener)

    fun updateData(list: ArrayList<ListItemModel>) {
        this.list = list
        notifyDataSetChanged()
    }
}