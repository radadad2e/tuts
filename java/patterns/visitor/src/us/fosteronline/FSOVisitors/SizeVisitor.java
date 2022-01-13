package us.fosteronline.FSOVisitors;
import us.fosteronline.FSOObjects.*;

public class SizeVisitor implements FSOVisitorInterface {
  @Override
  public int visit(Directory node) {
    System.out.println("Get Directory size");
    return 1000;
  }
  @Override
  public int visit(File node) {
    System.out.println("Get File size");
    return 100;
  }
  @Override
  public int visit(SymLink node) {
    System.out.println("Get SymLink size");
    return 10;
  }  
}
