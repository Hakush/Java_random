package com.mycompany.portfolio_test;

import java.util.ArrayList;

/**
 * Class Persona
 */
public class Persona {

  //
  // Fields
  //
    private int id;
  private String name;
  private int age;
  private String position;
  private String position2;
  private String from;
  private String cellphone;
  private String email;
  private String imgsrc;
  private String about;
    private ArrayList<Experiencia_Laboral> experiencias;
 
  //
  // Constructors
  //
  
  /**
   * @param id
   * @param name
   * @param age
   * @param position
   * @param position2
   * @param from
   * @param cellphone
   * @param email
   * @param imgsrc
   * @param about
   * @param experiencias
   */
    public Persona(int id, String name, int age, String position, String position2, String from, String cellphone, String email, String imgsrc, String about, ArrayList<Experiencia_Laboral> experiencias) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.position = position;
        this.position2 = position2;
        this.from = from;
        this.cellphone = cellphone;
        this.email = email;
        this.imgsrc = imgsrc;
        this.about = about;
        this.experiencias = experiencias;
    }
  

  //
  // Methods
  //


  //
  // Accessor methods
  //
   
   public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  /**
   * Set the value of name
   * @param newVar the new value of name
   */
  public void setName (String newVar) {
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
    public void setAge (int newVar) {
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
  public void setPosition (String newVar) {
    position = newVar;
  }

  /**
   * Get the value of position
   * @return the value of position
   */
  public String getPosition () {
    return position;
  }

  /**
   * Set the value of position2
   * @param newVar the new value of position2
   */
  public void setPosition2 (String newVar) {
    position2 = newVar;
  }

  /**
   * Get the value of position2
   * @return the value of position2
   */
  public String getPosition2 () {
    return position2;
  }

  /**
   * Set the value of from
   * @param newVar the new value of from
   */
  public void setFrom (String newVar) {
    from = newVar;
  }

  /**
   * Get the value of from
   * @return the value of from
   */
  public String getFrom () {
    return from;
  }

  /**
   * Set the value of cellphone
   * @param newVar the new value of cellphone
   */
  public void setCellphone (String newVar) {
    cellphone = newVar;
  }

  /**
   * Get the value of cellphone
   * @return the value of cellphone
   */
  public String getCellphone () {
    return cellphone;
  }

  /**
   * Set the value of email
   * @param newVar the new value of email
   */
  public void setEmail (String newVar) {
    email = newVar;
  }

  /**
   * Get the value of email
   * @return the value of email
   */
  public String getEmail () {
    return email;
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

  /**
   * Set the value of about
   * @param newVar the new value of about
   */
  public void setAbout (String newVar) {
    about = newVar;
  }

  /**
   * Get the value of about
   * @return the value of about
   */
  public String getAbout () {
    return about;
  }

    public ArrayList<Experiencia_Laboral> getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(ArrayList<Experiencia_Laboral> experiencias) {
        this.experiencias = experiencias;
    }
  
  

  //
  // Other methods
  //

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", name=" + name + ", age=" + age + ", position=" + position + ", position2=" + position2 + ", from=" + from + ", cellphone=" + cellphone + ", email=" + email + ", imgsrc=" + imgsrc + ", about=" + about + ", experiencias=" + experiencias + '}';
    }


}
