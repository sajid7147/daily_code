class employee {
  String name;

  void job() {
    System.out.println("come early");
  }
}

class worker extends employee {
  void display() {
    System.out.println("leave late " + name);
  }
}

public class inheritance {
  public static void main(String args[]) {
    worker department = new worker();

    department.name = "Arthur";
    department.display();
    department.job();
  }
}
