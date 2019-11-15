public class NavieSingleton {
  private static NavieSingleton instance;

  public NavieSingleton() {
  }

  public static NavieSingleton getInstance() {
    if (instance == null) {
      return new NavieSingleton();
    }

    return instance;
  }
}
