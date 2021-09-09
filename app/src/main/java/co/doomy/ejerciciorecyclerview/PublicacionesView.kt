package co.doomy.ejerciciorecyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PublicacionesView(itemView:View) : RecyclerView.ViewHolder(itemView){

    //identificar los UI components
    var imageRow : ImageView = itemView.findViewById(R.id.imageRow)
    var usernameRow : TextView = itemView.findViewById(R.id.usernameRow)
    var stateRow : TextView = itemView.findViewById(R.id.stateRow)
    var dateRow : TextView = itemView.findViewById(R.id.dateRow)
    var imageLikeRow : ImageView = itemView.findViewById(R.id.imageLikeRow)
    var likeTextRow : TextView = itemView.findViewById(R.id.likeTextRow)

}