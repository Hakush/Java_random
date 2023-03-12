package portfolio_test;



/**
 * Class Experiencia_Laboral
 */
public class Experiencia_Laboral {

  //
  // Fields
  //

  private String position;
  private String company;
  private String imgsrc;
  private String description;
  private String ref;
  private int start;
  private int end;
  
  //
  // Constructors
  //
  
  /**
 * @param position
 * @param company
 * @param imgsrc
 * @param description
 * @param ref
 * @param start
 * @param end
 */
  public Experiencia_Laboral(String position, String company, String imgsrc, String description, String ref, int start,
		int end) {
	super();
	this.position = position;
	this.company = company;
	this.imgsrc = imgsrc;
	this.description = description;
	this.ref = ref;
	this.start = start;
	this.end = end;
  }

  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of position
   * @param newVar the new value of position
   */
  private void setPosition (String newVar) {
    position = newVar;
  }

  /**
   * Get the value of position
   * @return the value of position
   */
  private String getPosition () {
    return position;
  }

  /**
   * Set the value of company
   * @param newVar the new value of company
   */
  private void setCompany (String newVar) {
    company = newVar;
  }

  /**
   * Get the value of company
   * @return the value of company
   */
  private String getCompany () {
    return company;
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
   * Set the value of ref
   * @param newVar the new value of ref
   */
  private void setRef (String newVar) {
    ref = newVar;
  }

  /**
   * Get the value of ref
   * @return the value of ref
   */
  private String getRef () {
    return ref;
  }

  /**
   * Set the value of start
   * @param newVar the new value of start
   */
  private void setStart (int newVar) {
    start = newVar;
  }

  /**
   * Get the value of start
   * @return the value of start
   */
  private int getStart () {
    return start;
  }

  /**
   * Set the value of end
   * @param newVar the new value of end
   */
  private void setEnd (int newVar) {
    end = newVar;
  }

  /**
   * Get the value of end
   * @return the value of end
   */
  private int getEnd () {
    return end;
  }

  //
  // Other methods
  //

}
