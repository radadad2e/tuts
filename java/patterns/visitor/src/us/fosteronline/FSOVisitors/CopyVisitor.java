package us.fosteronline.FSOVisitors;
import us.fosteronline.FSOObjects.*;

// Add commentary
public class CopyVisitor implements FSOVisitorInterface {
  private String tgt;

  public CopyVisitor(String target) {
    super();
    tgt = target;
  }
    
  @Override
  public int visit(Directory node) {
    System.out.println("Copying Directory to " + tgt);
    return 0;
  }

  @Override
  public int visit(File node) {
    System.out.println("Copying File to " + tgt);
    return 0;
  }

  @Override
  public int visit(SymLink node) {
    System.out.println("Copying SymLink to " + tgt);
    return 0;
  }
}
