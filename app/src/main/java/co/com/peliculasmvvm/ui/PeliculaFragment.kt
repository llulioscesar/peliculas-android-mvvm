package co.com.peliculasmvvm.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import co.com.peliculasmvvm.R
import co.com.peliculasmvvm.datos.PeliculaEntidad

/**
 * A fragment representing a list of Items.
 * Activities containing this fragment MUST implement the
 * [PeliculaFragment.OnListFragmentInteractionListener] interface.
 */
class PeliculaFragment : Fragment() {

    // TODO: Customize parameters
    private var columnCount = 1

    private lateinit var peliculaLista : List<PeliculaEntidad>
    private lateinit var adaptador : MyPeliculaRecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            columnCount = it.getInt(ARG_COLUMN_COUNT)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pelicula_list, container, false)

        // Set the adapter
        if (view is RecyclerView) {
            with(view) {
                layoutManager = when {
                    columnCount <= 1 -> LinearLayoutManager(context)
                    else -> GridLayoutManager(context, columnCount)
                }
                adaptador = MyPeliculaRecyclerViewAdapter(
                    activity!!.applicationContext,
                    peliculaLista
                )
                this.adapter = adaptador
            }
        }
        return view
    }

    companion object {

        // TODO: Customize parameter argument names
        const val ARG_COLUMN_COUNT = "column-count"

        // TODO: Customize parameter initialization
        @JvmStatic
        fun newInstance(columnCount: Int) =
            PeliculaFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_COLUMN_COUNT, columnCount)
                }
            }
    }
}
