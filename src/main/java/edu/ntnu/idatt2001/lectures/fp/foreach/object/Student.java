package edu.ntnu.idatt2001.lectures.fp.foreach.object;

/**
 * Student.java - "Programmering i Java", 4.utgave - 2009-07-01 Fra programliste
 * 11.5 side 361.
 *
 * Komposisjon: Navneobjektet er gjemt inne i studentobjektet. Klienten
 * forholder seg ikke til klassen Navn i det hele tatt.
 */

public class Student {
  private Navn navn;
  private final int fdato;
  private final String kjoenn;

  public Student(String fornavn, String etternavn, int fdato, String kjoenn) {
    this.navn = new Navn(fornavn, etternavn);
    this.fdato = fdato;
    this.kjoenn = kjoenn;
  }

  public String getUniqueIdasString() {
    String uniqueId = "" + this.getFdato() + "-" + this.getNavn();
    return uniqueId;
  }

  public int getFdato() {
    return fdato;
  }

  public String getKjoenn() {
    return kjoenn;
  }

  public String getEtternavn() {
    return navn.getEtternavn();
  }

  public String getFornavn() {
    return navn.getFornavn();
  }

  public String getNavn() {
    return navn.toString();
  }

  public void setFornavn(String fornavn) {
    navn.setFornavn(fornavn);
  }

  public void setEtternavn(String etternavn) {
    navn.setEtternavn(etternavn);
  }

  public String toString() {
    return navn + ", f�dt: " + fdato;
  }
}