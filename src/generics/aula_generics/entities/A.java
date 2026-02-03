package generics.aula_generics.entities;

public class A extends Product{


    public A(String field, double v) {
        super(field, v);
    }

    @Override
    public String toString() {
        return "a []" + super.toString();
    }
}
