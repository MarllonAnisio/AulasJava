package generics.aula_generics.entities;

public class C  extends Product{
    public C(String field, double v) {
        super(field, v);
    }

    @Override
    public String toString() {
        return "c []" + super.toString();
    }
}
