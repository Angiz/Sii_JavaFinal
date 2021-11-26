package Day6;

class Para<S, T> {

    S first;

    T second;



    public Para(S f, T s) {

        this.first = f;

        this.second = s;

    }



    public S getFirst() { return first; }

    public T getSecond()   { return second; }



    public void setFirst(S f) {this.first = f; }

    public void setSecond(T s) {this.second = s; }

}