import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Test
  public void Member_instantiatesCorrectly_true() {
    Member newMember = new Member("James");
    assertEquals(true, newMember instanceof Member);
  }

  @Test
  public void Member_instantiatesWithName_String() {
    Member newMember = new Member("james");
    assertEquals("james", newMember.getName());
  }

  @Test
  public void all_returnsAllInstancesOfMember_true() {
    Member firstMember = new Member("James");
    Member secondMember = new Member("Jack");
    assertEquals(true, Member.all().contains(firstMember));
    assertEquals(true, Member.all().contains(secondMember));
  }

  @Test
  public void clear_emptiesAllMembersFromArrayList_0() {
    Member newMember = new Member("james");
    Member.clear();
    assertEquals(0, Member.all().size());
  }

  @Test
  public void getId_MemberInstantiatesWithAnID_1() {
    Member.clear();
    Member newMember = new Member("James");
    assertEquals(1, newMember.getId());
  }

  @Test
  public void find_returnsMemberWithSameId_secondMember() {
    Member firstMember = new Member("james");
    Member secondMember = new Member("jack:");
    assertEquals(Member.find(secondMember.getId()), secondMember);
  }
}
