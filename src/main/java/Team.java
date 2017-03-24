import java.util.List;
import java.util.ArrayList;

public class Team {
  private String mTeamName;
  private static List<Team> teams = new ArrayList<Team>();
  private int mId;
  private List<Member> mName;

  public Team(String teamName) {
    mTeamName = teamName;
    teams.add(this);
    mId = teams.size();
    mName = new ArrayList<Member>();
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

  public int getId() {
    return mId;
  }

  public static Team find(int id) {
    return teams.get(id - 1);
  }

  public List<Member> getMembers() {
    return mName;
  }

  public void addMember(Member name) {
    mName.add(name);
  }
}
