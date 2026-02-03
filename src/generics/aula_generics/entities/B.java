package generics.aula_generics.entities;

public class B extends Product{

    public B(String field, double v) {
        super(field, v);
    }

    @Override
    public String toString() {
        return "b []" + super.toString();
    }
}
