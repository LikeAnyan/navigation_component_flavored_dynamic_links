package sergeyb.articles.nav_dynamic_links.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import sergeyb.articles.nav_dynamic_links.R

class DeeplinkFragment : Fragment(R.layout.fragment_deeplink) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btnBack).setOnClickListener {
            findNavController().navigate(R.id.introFragment)
        }
    }
}