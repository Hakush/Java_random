package com.mycompany.portfolio_test;

/**
 * Class Skill
 */
public class Skill {

  //
  // Fields
  //

    private int id;
  private String name;
  private int progress;
  
  //
  // Constructors
  //
  /**
   * @param id
 * @param name
 * @param progress
 */
  public Skill(int id, String name, int progress) {
	super();
        this.id = id;
	this.name = name;
	this.progress = progress;
  }

  //
  // Methods
  //

  public int getId () {
        return id;
  }

    //
    // Accessor methods
    //
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Set the value of name
     * @param newVar the new value of name
     */
    public void setName(String newVar) {
        name = newVar;
    }

  /**
   * Get the value of name
   * @return the value of name
   */
  public String getName () {
    return name;
  }

  /**
   * Set the value of progress
   * @param newVar the new value of progress
   */
  public void setProgress (int newVar) {
    progress = newVar;
  }

  /**
   * Get the value of progress
   * @return the value of progress
   */
  public int getProgress () {
    return progress;
  }

  //
  // Other methods
  //

    @Override
    public String toString() {
        return "Skill{" + "id=" + id + ", name=" + name + ", progress=" + progress + '}';
    }

}
