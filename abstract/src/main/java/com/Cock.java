package com;
public class Cock extends Chicken{
  public Cock() {
  }

  @Override
  public void setTypes() {
    super.setType("cock");
  }
  @Override
  public void setPrices() {
    super.setPrice(5);
  }

}
