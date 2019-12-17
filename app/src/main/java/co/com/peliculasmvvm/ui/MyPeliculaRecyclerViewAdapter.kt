package co.com.peliculasmvvm.ui

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import co.com.peliculasmvvm.R
import co.com.peliculasmvvm.datos.PeliculaEntidad
import kotlinx.android.synthetic.main.fragment_pelicula.view.*


class MyPeliculaRecyclerViewAdapter(
    private val contexto: Context,
    private val mValues: List<PeliculaEntidad>
) : RecyclerView.Adapter<MyPeliculaRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_pelicula, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mValues[position]
    }

    override fun getItemCount(): Int = mValues.size

    inner class ViewHolder(val mView: View) : RecyclerView.ViewHolder(mView) {
        val mIdView: TextView = mView.item_number
        val mContentView: TextView = mView.content

        lateinit var pelicula : PeliculaEntidad

        override fun toString(): String {
            return super.toString() + " '" + mContentView.text + "'"
        }
    }
}
