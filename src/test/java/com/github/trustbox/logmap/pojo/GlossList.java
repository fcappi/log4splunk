package com.github.trustbox.logmap.pojo;

public class GlossList {
  private GlossEntry GlossEntry = new GlossEntry();

  public GlossEntry getGlossEntry() {
    return GlossEntry;
  }

  public void setGlossEntry(GlossEntry GlossEntry) {
    this.GlossEntry = GlossEntry;
  }

  @Override
  public String toString() {
    return "ClassPojo [GlossEntry = " + GlossEntry + "]";
  }
}
