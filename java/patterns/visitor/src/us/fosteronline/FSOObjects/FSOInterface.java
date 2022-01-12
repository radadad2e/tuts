package us.fosteronline.FSOObjects;
import us.fosteronline.FSOVisitors.*;

public interface FSOInterface {
  public int accept(FSOVisitorInterface visitor);
}
