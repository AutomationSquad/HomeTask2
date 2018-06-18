package interfaces;

public interface ITypeValue {
    String iValue = "Lorem ipsum";

    default String typeSomeValue() {
        return iValue;
    }
}
