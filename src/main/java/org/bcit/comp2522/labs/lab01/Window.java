package org.bcit.comp2522.labs.lab01;

import processing.core.PApplet;

/** Window
 * Creates a window to draw on.
 */
public class Window extends PApplet {

  public void settings() {
    size(500, 500);
  }

  /** Draws a snail.
   *
   */
  public void draw() {
    //body
    rect(150, 290, 275, 50, 25);

    //eye stalks
    line(390, 290, 380, 240);
    line(405, 290, 415, 240);
    circle(380, 240, 10);
    circle(415, 240, 10);

    //shell first quarter
    arc(250, 250, 175, 175, PI + HALF_PI, TWO_PI + QUARTER_PI);
    arc(250, 250, 100, 100, PI + HALF_PI, TWO_PI);
    //shell second quarter
    arc(250, 250, 150, 150, PI, HALF_PI + PI);
    arc(250, 250, 75, 75, PI, HALF_PI + PI);
    //shell third quarter
    arc(250, 250, 125, 125, HALF_PI, PI);
    arc(250, 250, 50, 50, HALF_PI, PI);
    //shell fourth quarters
    arc(250, 250, 80, 80, 0, HALF_PI);
    arc(250, 250, 25, 25, 0, HALF_PI);
  }

  /** Changes background colour on mouse press.
   *
   */
  public void mousePressed() {
    background(64);
  }

  /** Runs the program.
   *
   * @param args unused
   */
  public static void main(String[] args) {
    String[] processingArgs = {"window"};
    Window window = new Window();
    PApplet.runSketch(processingArgs, window);
  }

}
