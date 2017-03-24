import java.util.ArrayList;
import java.util.List;

public class Member {
  private String mName;
  private static List<Member> members = new ArrayList<Member>();
  private int mId;

  public Member(String name) {
    mName = name;
    members.add(this);
    mId = members.size();
  }

  public String getName() {
    return mName;
  }

  public static List<Member> all() {
    return members;
  }

  public static void clear() {
    members.clear();
  }

  public int getId() {
    return mId;
  }

  public static Member find(int id) {
    return members.get(id - 1);
  }
}
