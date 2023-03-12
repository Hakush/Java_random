package portfolio_test;



/**
 * Class Project
 */
public class Project {

  //
  // Fields
  //

  private String name;
  private String description;
  private String url;
  private String repoURL;
  private String imgsrc;
  
  //
  // Constructors
  //
  
  /**
 * @param name
 * @param description
 * @param url
 * @param repoURL
 * @param imgsrc
 */
  public Project(String name, String description, String url, String repoURL, String imgsrc) {
	super();
	this.name = name;
	this.description = description;
	this.url = url;
	this.repoURL = repoURL;
	this.imgsrc = imgsrc;
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
   * Set the value of description
   * @param newVar the new value of description
   */
  private void setDescription (String newVar) {
    description = newVar;
  }

  /**
   * Get the value of description
   * @return the value of description
   */
  private String getDescription () {
    return description;
  }

  /**
   * Set the value of URL
   * @param newVar the new value of URL
   */
  private void setURL (String newVar) {
    this.url = newVar;
  }

  /**
   * Get the value of URL
   * @return the value of URL
   */
  private String getURL () {
    return this.url;
  }

  /**
   * Set the value of repoURL
   * @param newVar the new value of repoURL
   */
  private void setRepoURL (String newVar) {
    repoURL = newVar;
  }

  /**
   * Get the value of repoURL
   * @return the value of repoURL
   */
  private String getRepoURL () {
    return repoURL;
  }

  /**
   * Set the value of imgsrc
   * @param newVar the new value of imgsrc
   */
  private void setImgsrc (String newVar) {
    imgsrc = newVar;
  }

  /**
   * Get the value of imgsrc
   * @return the value of imgsrc
   */
  private String getImgsrc () {
    return imgsrc;
  }

  //
  // Other methods
  //

}
