package us.fosteronline.FSOObjects;
import us.fosteronline.FSOVisitors.*;

// Classy
public class Directory implements FSOInterface {
  @Override public int accept(FSOVisitorInterface visitor) {
    return visitor.visit(this);
  }
}
