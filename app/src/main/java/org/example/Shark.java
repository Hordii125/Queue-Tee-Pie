package org.example;

public class Shark implements Cutie {
  public String description() {
    return "Sharks are sleek, powerful, and misunderstood creatures of the sea.";
  }

  public Integer cutenessRating() {
    return 3; // Sharks are not typically considered cute, but they have their own charm.
  }
    
  public String tag() {
    return "Shark";
  }
}
