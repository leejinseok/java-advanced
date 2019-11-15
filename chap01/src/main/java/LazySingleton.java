public class LazySingleton {
  private static LazySingleton instance;

  public static synchronized LazySingleton getInstance() {
    if (instance == null) {
      return new LazySingleton();
    }

    return instance;
  }
}
