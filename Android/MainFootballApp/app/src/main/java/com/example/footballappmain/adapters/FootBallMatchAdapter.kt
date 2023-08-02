import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.footballappmain.R

class FootballMatchAdapter(private val matches: List<FootballMatch>) : RecyclerView.Adapter<FootballMatchViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FootballMatchViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.football_match_item, parent, false)

        return FootballMatchViewHolder(view)
    }

    override fun onBindViewHolder(holder: FootballMatchViewHolder, position: Int) {
        val match = matches[position]

        holder.homeTeamTextView.text = match.homeTeam
        holder.awayTeamTextView.text = match.awayTeam
        holder.scoreTextView.text = match.score
        holder.dateTextView.text = match.date
    }

    override fun getItemCount() = matches.size
}