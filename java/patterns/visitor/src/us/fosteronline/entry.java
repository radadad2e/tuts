package us.fosteronline;
import us.fosteronline.FSOObjects.*;
import us.fosteronline.FSOVisitors.*;

/**
 * The visitor method allows us to create similar functions across multiple objects.
 * Here, for instance, Directory, File and SymLink all support a copy method.
 *   We could write this method in those classes directly, and keep the Directory functions together, separate from the  File methods.
 *   Or, with a visitor, we can write the method outside of the classes, and keep the functional behavior for all classes together.
 * Best bit:
 *   When accept() <=> visit() is established, it is easy to create new functionality without changing any existing interfaces/classes.
 */

public class entry {
  public static void main(String[] args) {
    int result = 0;

    Directory dir = new Directory();
    File file = new File();
    SymLink symlink = new SymLink();
    
    // Get object sizes
    result = dir.accept(new GetSizeVisitor());
    System.out.println("Result: " + result);
    result = file.accept(new GetSizeVisitor());
    System.out.println("Result: " + result);
    result = symlink.accept(new GetSizeVisitor());
    System.out.println("Result: " + result);

    // Copy objects
    // This requires passing in a target parameter. Observe how this is done via the CopyVisitor constructor.
    result = dir.accept(new CopyVisitor("tgtFolder1"));
    System.out.println("Result: " + result);
    result = file.accept(new CopyVisitor("tgtFolder2"));
    System.out.println("Result: " + result);
    result = symlink.accept(new CopyVisitor("tgtFolder3"));
    System.out.println("Result: " + result);
  }
}
