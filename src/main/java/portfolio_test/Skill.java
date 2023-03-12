package portfolio_test;



/**
 * Class Skill
 */
public class Skill {

  //
  // Fields
  //

  private String name;
  private int progress;
  
  //
  // Constructors
  //
  /**
 * @param name
 * @param progress
 */
  public Skill(String name, int progress) {
	super();
	this.name = name;
	this.progress = progress;
  }

  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of name
   * @param newVar the new value of name
   */
  private void setName (String newVar) {
    name = newVar;
  }

  /**
   * Get the value of name
   * @return the value of name
   */
  private String getName () {
    return name;
  }

  /**
   * Set the value of progress
   * @param newVar the new value of progress
   */
  private void setProgress (int newVar) {
    progress = newVar;
  }

  /**
   * Get the value of progress
   * @return the value of progress
   */
  private int getProgress () {
    return progress;
  }

  //
  // Other methods
  //

}
