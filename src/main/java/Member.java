import java.util.ArrayList;
import java.util.List;

public class Member {
  private String mName;
  private static List<Member> members = new ArrayList<Member>();

  public Member(String name) {
    mName = name;
    members.add(this);
  }

  public String getName() {
    return mName;
  }

  public static List<Member> all() {
    return members;
  }
}
