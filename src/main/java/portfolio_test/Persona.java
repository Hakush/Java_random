package portfolio_test;



/**
 * Class Persona
 */
public class Persona {

  //
  // Fields
  //

  private String name;
  private int age;
  private String position;
  private String position2;
  private String from;
  private String cellphone;
  private String email;
  private String imgsrc;
  private String about;
  
  //
  // Constructors
  //
  
  /**
   * @param name
   * @param age
   * @param position
   * @param position2
   * @param from
   * @param cellphone
   * @param email
   * @param imgsrc
   * @param about
   */
   public Persona(String name, int age, String position, String position2, String from, String cellphone, String email,
  		String imgsrc, String about) {
  	super();
  	this.name = name;
  	this.age = age;
  	this.position = position;
  	this.position2 = position2;
  	this.from = from;
  	this.cellphone = cellphone;
  	this.email = email;
  	this.imgsrc = imgsrc;
  	this.about = about;
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

  public String getName () {
    return name;
  }

  /**
   * Set the value of age
   * @param newVar the new value of age
   */
  @SuppressWarnings("unused")
private void setAge (int newVar) {
    age = newVar;
  }

  /**
   * Get the value of age
   * @return the value of age
   */
  public int getAge () {
    return age;
  }

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
   * Set the value of position2
   * @param newVar the new value of position2
   */
  private void setPosition2 (String newVar) {
    position2 = newVar;
  }

  /**
   * Get the value of position2
   * @return the value of position2
   */
  private String getPosition2 () {
    return position2;
  }

  /**
   * Set the value of from
   * @param newVar the new value of from
   */
  private void setFrom (String newVar) {
    from = newVar;
  }

  /**
   * Get the value of from
   * @return the value of from
   */
  private String getFrom () {
    return from;
  }

  /**
   * Set the value of cellphone
   * @param newVar the new value of cellphone
   */
  private void setCellphone (String newVar) {
    cellphone = newVar;
  }

  /**
   * Get the value of cellphone
   * @return the value of cellphone
   */
  private String getCellphone () {
    return cellphone;
  }

  /**
   * Set the value of email
   * @param newVar the new value of email
   */
  private void setEmail (String newVar) {
    email = newVar;
  }

  /**
   * Get the value of email
   * @return the value of email
   */
  private String getEmail () {
    return email;
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
   * Set the value of about
   * @param newVar the new value of about
   */
  private void setAbout (String newVar) {
    about = newVar;
  }

  /**
   * Get the value of about
   * @return the value of about
   */
  private String getAbout () {
    return about;
  }

  //
  // Other methods
  //

}
