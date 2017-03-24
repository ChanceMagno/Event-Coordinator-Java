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

  @Test
  public void clear_emptiesAllTeamsFromList_0() {
    Team testTeam = new Team("team1");
    Team.clear();
    assertEquals(Team.all().size(), 0);
  }

  @Test
  public void team_InstantiatesWithAnId_1() {
    Team newTeam = new Team("team1");
    assertEquals(1, newTeam.getId());
  }

  @Test
  public void find_returnsTeamWithSameId_secondTeam() {
    Team.clear();
    Team team1 = new Team("team1");
    Team team2 = new Team("team2");
    assertEquals(Team.find(team2.getId()), team2);
  }

  @Test
  public void getMember_inititallyReturnsEmptyList_ArrayList() {
    Team.clear();
    Team newTeam = new Team("team1");
    assertEquals(0, newTeam.getMembers().size());
  }

  @Test
  public void addMember_addsMemberToTeamList_true() {
    Team newTeam = new Team("team1");
    Member newMember = new Member("james");
    newTeam.addMember(newMember);
    assertTrue(newTeam.getMembers().contains(newMember));
  }
}
