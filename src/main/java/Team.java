import java.util.List;
import java.util.ArrayList;

public class Team {
  private String mTeamName;
  private static List<Team> teams = new ArrayList<Team>();

  public Team(String teamName) {
    mTeamName = teamName;
    teams.add(this);
  }

  public String getTeamName() {
    return mTeamName;
  }

  public static List<Team> all() {
    return teams;
  }

  public static void clear() {
    teams.clear();
  }
}
