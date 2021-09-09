package co.doomy.ejerciciorecyclerview

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_agregar_publicacion.*

class AgregarPublicacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_publicacion)

        publicarBtn.setOnClickListener {
            val intent = Intent().apply {
                putExtra("username", usuarioET.text.toString())
                putExtra("state", estadoMT.text.toString())
            }

            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}