package co.doomy.ejerciciorecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var layoutManager: LinearLayoutManager;

    private lateinit var adapter: PublicationsAdapter;
    private var counter = 0;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val launcher = registerForActivityResult(StartActivityForResult(), ::onResult)

        layoutManager = LinearLayoutManager(this)

        publicacionesRecycler.layoutManager = layoutManager
        publicacionesRecycler.setHasFixedSize(true)

        adapter = PublicationsAdapter()
        publicacionesRecycler.adapter = adapter


        addPubliBtn.setOnClickListener {

            val intent = Intent(this, AgregarPublicacion::class.java).apply {
                // no le voy a enviar nada (ningun putExtra)
            }
            launcher.launch(intent)
        }
    }

    private fun onResult(result: ActivityResult){
        if(result.resultCode == RESULT_OK){
            val data = result.data

            var id = counter
            val username = data?.extras?.getString("username")
            val state = data?.extras?.getString("state")

            val publi = Publicacion("A", username, state)
            adapter.addPublication(publi)
        }
    }
}