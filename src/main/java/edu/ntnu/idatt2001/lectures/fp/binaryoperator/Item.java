package edu.ntnu.idatt2001.lectures.fp.binaryoperator;

public class Item {
  private int id;
  private String value;

  public Item(int id, String value) {
    this.id = id;
    this.value = value;
  }

  public int getId() {
    return id;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "[id = " + id + ", value = " + value + "]";
  }
}