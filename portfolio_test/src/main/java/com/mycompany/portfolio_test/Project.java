package com.mycompany.portfolio_test;

/**
 * Class Project
 */
public class Project {

  //
  // Fields
  //
    
    private int id;
  private String name;
  private String description;
  private String url;
  private String repoURL;
  private String imgsrc;
  
  //
  // Constructors
  //
  
  /**
   * @param id
 * @param name
 * @param description
 * @param url
 * @param repoURL
 * @param imgsrc
 */
  public Project(int id, String name, String description, String url, String repoURL, String imgsrc) {
	super();
        this.id = id;
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
  
    public int getId () {
        return id;
  }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }
    
    public void setUrl(String url) {
        this.url = url;
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
   * Set the value of description
   * @param newVar the new value of description
   */
  public void setDescription (String newVar) {
    description = newVar;
  }

  /**
   * Get the value of description
   * @return the value of description
   */
  public String getDescription () {
    return description;
  }

  /**
   * Set the value of repoURL
   * @param newVar the new value of repoURL
   */
  public void setRepoURL (String newVar) {
    repoURL = newVar;
  }

  /**
   * Get the value of repoURL
   * @return the value of repoURL
   */
  public String getRepoURL () {
    return repoURL;
  }

  /**
   * Set the value of imgsrc
   * @param newVar the new value of imgsrc
   */
  public void setImgsrc (String newVar) {
    imgsrc = newVar;
  }

  /**
   * Get the value of imgsrc
   * @return the value of imgsrc
   */
  public String getImgsrc () {
    return imgsrc;
  }

  //
  // Other methods
  //

    @Override
    public String toString() {
        return "Project{" + "id=" + id + ", name=" + name + ", description=" + description + ", url=" + url + ", repoURL=" + repoURL + ", imgsrc=" + imgsrc + '}';
    }

}
