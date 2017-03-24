import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

  @Test
  public void team_instantiatesCorrectly_true() {
    Team newTeam = new Team("team1");
    assertEquals(true, newTeam instanceof Team);
  }

  @Test
  public void team_InstantiatesWithName_team1() {
    Team newTeam = new Team("team1");
    assertEquals("team1", newTeam.getTeamName());
  }

  @Test
  public void all_returnsAllInstancesOfTeam_true() {
    Team team1 = new Team("team1");
    Team team2 = new Team("team2");
    assertEquals(true, Team.all().contains(team1));
    assertEquals(true, Team.all().contains(team2));
  }
}
