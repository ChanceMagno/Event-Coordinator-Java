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
}
