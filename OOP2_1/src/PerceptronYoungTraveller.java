import java.util.ArrayList;
import java.util.Vector;

public abstract class PerceptronYoungTraveller implements PerceptronTraveller {

    Vector weightBias;

    public PerceptronYoungTraveller(Vector weightBias) {
        this.weightBias = weightBias;
    }

    @Override
    public ArrayList recommend(boolean recom) {
        //return ArrayList of cities
        if (recom); /*return arraylist of cities UpperCased*/
        else ; //return arraylist of cities LowerCased
        return null;
    }
}
