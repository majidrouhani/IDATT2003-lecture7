package fp.stream.reduce;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

import fp.foreach.object.Navn;

/**
 * Student.java - "Programmering i Java", 4.utgave - 2009-07-01 Fra programliste
 * 11.5 side 361.
 *
 * Komposisjon: Navneobjektet er gjemt inne i studentobjektet. Klienten
 * forholder seg ikke til klassen Navn i det hele tatt.
 */

public class Student {
  private Navn navn;
  private final Date fdato;
  private final String kjoenn;

  public Student(String fornavn, String etternavn, String fdato, String kjoenn)
      throws ParseException {
    this.fdato = new SimpleDateFormat("yyyy/MM/dd").parse(fdato);

    this.navn = new Navn(fornavn, etternavn);
    this.kjoenn = kjoenn;
  }

  public Date getFdato() {
    return fdato;
  }

  public int getAlder() {
    Calendar calendar = Calendar.getInstance();
    calendar.setTimeInMillis(this.fdato.getTime());

    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH);
    int day = calendar.get(Calendar.DAY_OF_MONTH);

    LocalDate l = LocalDate.of(year, month, day);
    LocalDate now = LocalDate.now();
    Period diff = Period.between(l, now);

    return diff.getYears();
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

  @Override
  public String toString() {
    return "Student [navn=" + navn + ", fdato=" + fdato + ", kjoenn=" + kjoenn + "]";
  }
}