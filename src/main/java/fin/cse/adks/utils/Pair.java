package fin.cse.adks.utils;

/**
 * A helper class to define tuples.
 * 
 * @author Pavlo Shevchenko (pavlo.shevchenko@st.ovgu.de)
 */
public class Pair<X, Y> {
    public final X first;
    public final Y second;

    public Pair(X first, Y second) {
        this.first = first;
        this.second = second;
    }
}