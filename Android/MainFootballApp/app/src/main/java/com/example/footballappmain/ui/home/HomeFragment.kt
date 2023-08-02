package com.example.footballappmain.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.footballappmain.adapters.FootballMatchAdapter
import com.example.footballappmain.models.FootballMatch
import com.example.footballappmain.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        recyclerView = binding.myRecyclerView

val matches = listOf(
    FootballMatch(1, "Real Madrid", "Manchester City", "2-1", "14-09-2023"),
    FootballMatch(2, "Bayern Munich", "Liverpool", "1-0", "15-09-2023"),
    FootballMatch(3, "Barcelona", "Paris Saint-Germain", "3-2", "16-09-2023"),
    FootballMatch(4, "Atletico Madrid", "Chelsea", "0-0", "17-09-2023"),
    FootballMatch(5, "Juventus", "Inter Milan", "4-1", "18-09-2023"),
    FootballMatch(6, "Manchester United", "AC Milan", "0-2", "19-09-2023"),
    FootballMatch(7, "Tottenham", "Borussia Dortmund", "2-2", "20-09-2023"),
    FootballMatch(8, "Benfica", "Porto", "1-1", "21-09-2023"),
    FootballMatch(9, "Ajax", "Feyenoord", "2-0", "22-09-2023"),
    FootballMatch(10, "Napoli", "Lazio", "3-1", "23-09-2023"),
    FootballMatch(11, "RB Leipzig", "Bayer Leverkusen", "0-3", "24-09-2023"),
    FootballMatch(12, "Monaco", "Lyon", "2-3", "25-09-2023"),
    FootballMatch(13, "Sevilla", "Real Sociedad", "1-4", "26-09-2023"),
    FootballMatch(14, "Roma", "Fiorentina", "0-1", "27-09-2023"),
    FootballMatch(15, "Valencia", "Villarreal", "2-2", "28-09-2023"),
    FootballMatch(16, "PSV", "AZ Alkmaar", "1-0", "29-09-2023")
)


        viewManager = LinearLayoutManager(this.context)
        viewAdapter = FootballMatchAdapter(matches)

        recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
