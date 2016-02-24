package {{packageName}};

final class DaggerInitializer {
  static {{applicationName}}Component init({{applicationName}}App app) {
    return DaggerProduction{{applicationName}}Component.builder()
        .{{applicationNameCamelCase}}Module(new {{applicationName}}Module(app))
        .build();
  }

  private DaggerInitializer() {
    throw new AssertionError("No Instances.");
  }
}
