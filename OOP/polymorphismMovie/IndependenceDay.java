package polymorphismMovie;


public class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("Independent Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}