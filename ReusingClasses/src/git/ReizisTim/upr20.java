package git.ReizisTim;
//Продемонстрируйте, что аннотация @Override решает проблему, связанную с мнимым переопределением приватных методов.

public class upr20 {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
// You can upcast:
        OverridingPrivate op = op2;
// But you can’t call the methods:
//! op.f();
//! op.g();
// Same here:
        WithFinals wf = op2;
//! wf.f();
//! wf.g();
    }
}
class WithFinals {
    // Identical to "private" alone:
    private final void f() { System.out.println("WithFinals.f()"); }
    // Also automatically "final":
    private void g() { System.out.println("WithFinals.g()"); }
}
class OverridingPrivate2a extends WithFinals {
     private final void f() {
        System.out.println("OverridingPrivate.f()");
    }
    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}
class OverridingPrivate2 extends OverridingPrivate2a {
    public final void f() {
        System.out.println("OverridingPrivate2.f()");
    }
    public void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}
