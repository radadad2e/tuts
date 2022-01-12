package us.fosteronline.FSOVisitors;
import us.fosteronline.FSOObjects.*;

public interface FSOVisitorInterface {
  public int visit(Directory node);
  public int visit(File node);
  public int visit(SymLink node);
}

