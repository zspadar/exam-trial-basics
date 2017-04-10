/**
 * Created by zsuzsanna.padar on 2017. 04. 10..
 */
public class CubeSides {
  private int a;
  private int b;
  private  int c;

  public CubeSides(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  public int getC() {
    return c;
  }

   void getSurface(int a, int b, int c) {
    int surface = 2 * a * b + 2 * b * c + 2 * c * a;
    System.out.println(surface);
  }

  void getValue(int a, int b, int c) {
    int value = a * b* c;
    System.out.println(value);
  }
}
