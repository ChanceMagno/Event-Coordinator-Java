import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Test
  public void Member_instantiatesCorrectly_true() {
    Member newMember = new Member("James");
    asserTrue(newMember instanceof Member);
  }
}
