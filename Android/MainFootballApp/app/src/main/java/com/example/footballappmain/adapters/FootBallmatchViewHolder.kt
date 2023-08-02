import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.footballappmain.R

class FootballMatchViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val homeTeamTextView: TextView = view.findViewById(R.id.home_team)
    val awayTeamTextView: TextView = view.findViewById(R.id.away_team)
    val scoreTextView: TextView = view.findViewById(R.id.score)
    val dateTextView: TextView = view.findViewById(R.id.date)
}