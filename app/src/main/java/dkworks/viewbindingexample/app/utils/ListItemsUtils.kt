package dkworks.viewbindingexample.app.utils

import dkworks.viewbindingexample.app.model.ListItemModel

fun getListItems(): ArrayList<ListItemModel> {
    val arr = arrayListOf<ListItemModel>()

    arr.add(
        ListItemModel(
            0,
            "Dominic Horton"
        )
    )

    arr.add(
        ListItemModel(
            1,
            "Declan Hart"
        )
    )

    arr.add(
        ListItemModel(
            2,
            "Charles Dickson"
        )
    )

    arr.add(
        ListItemModel(
            3,
            "Nora Rice"
        )
    )

    arr.add(
        ListItemModel(
            4,
            "Paul Payne"
        )
    )

    arr.add(
        ListItemModel(
            5,
            "Ivy Franco"
        )
    )

    return arr
}