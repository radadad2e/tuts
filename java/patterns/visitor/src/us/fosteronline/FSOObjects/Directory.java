package us.fosteronline.FSOObjects;
import us.fosteronline.FSOVisitors.*;

// commentary
public class Directory implements FSOInterface {
  @Override public int accept(FSOVisitorInterface visitor) {
    return visitor.visit(this);
  }
}
