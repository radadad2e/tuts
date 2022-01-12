package us.fosteronline.FSOObjects;
import us.fosteronline.FSOVisitors.*;

public class Directory implements FSOInterface {
  @Override public int accept(FSOVisitorInterface visitor) {
    return visitor.visit(this);
  }
}
