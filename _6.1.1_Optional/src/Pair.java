public final class Pair<T1, T2> {
    private T1 value1 = null;
    private T2 value2 = null;

    private Pair(T1 value1, T2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public static <T1, T2> Pair<T1, T2> of(T1 value1, T2 value2) {
        return new Pair<>(value1, value2);
    }

    public T1 getFirst() {
        return value1;
    }

    public T2 getSecond() {
        return value2;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = result + 31 * value1.hashCode();
        result = 31 * result + 31 * value2.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Pair<T1, T2> pair = (Pair) obj;

        return value1.equals(pair.value1) && value2.equals(pair.value2);


    }

}
