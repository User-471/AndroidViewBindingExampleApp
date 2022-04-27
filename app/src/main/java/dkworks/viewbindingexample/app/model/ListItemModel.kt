package dkworks.viewbindingexample.app.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class ListItemModel(
    val id: Int,
    val title: String
): Parcelable