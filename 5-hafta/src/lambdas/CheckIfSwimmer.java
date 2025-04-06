package lambdas;

public class CheckIfSwimmer implements CheckTrait{
    @Override
    public boolean test(Animal animal) {
        return animal.canSwim();
    }
}
