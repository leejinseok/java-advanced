public interface InterfaceWithDefinition {
  String CONSTANT = "CONSTANT";

  enum InnerEnum {
    E1, E2
  }

  class InnerClass {

  }

  interface InnerInterface {
    void performInnerAction();
  }

  void performAction();
}
