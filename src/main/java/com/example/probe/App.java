package com.example.probe;

import org.apache.commons.io.FilenameUtils;

public class App {
  public static void main(String[] args) {
    System.out.println(FilenameUtils.getExtension("probe.txt"));
  }
}
