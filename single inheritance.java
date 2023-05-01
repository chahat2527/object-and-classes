public class parent {
    void bike() {
        system.out.println("Hero");
    }
}

class child extends parent {
    void cycle() {
        system.out.println("Atulse");
    }
}

public class Mytest {
    public static void main(string[] args) {
        child c = new child();
        c.bike();
        c.cycle();
    }
}