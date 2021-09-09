package co.doomy.ejerciciorecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PublicationsAdapter : RecyclerView.Adapter<PublicacionesView>(){

    private val publicaciones = ArrayList<Publicacion>()

    fun addPublication(publi: Publicacion){
        publicaciones.add(publi)
        notifyItemInserted(publicaciones.size-1)
    }

    init {
        publicaciones.add(Publicacion("A", "Juand", "Con hambre"))
        publicaciones.add(Publicacion("B", "Vi", "Golpea primero, pregunta mientras golpees"))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PublicacionesView {

        var inflater = LayoutInflater.from(parent.context)
        val row = inflater.inflate(R.layout.publicationrow, parent, false)
        val publicacionesView = PublicacionesView(row)
        return publicacionesView
    }

    override fun onBindViewHolder(skeleton: PublicacionesView, position: Int) {
        val publicacion = publicaciones[position]

        skeleton.usernameRow.text = publicacion.username
        skeleton.stateRow.text = publicacion.state
        skeleton.dateRow.text = "24 de Octubre de 2021"
        skeleton.likeTextRow.text = "A 17 personas les gusta esto"
    }

    override fun getItemCount(): Int {
        return publicaciones.size
    }


}