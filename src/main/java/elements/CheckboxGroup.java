package elements;

public class CheckboxGroup {
    boolean defaultState;

    public CheckboxGroup(String defaultState) {
        this.defaultState = true;
    }

    public CheckboxGroup(boolean defaultState) {
        this.defaultState = defaultState;
    }

    public boolean isDefaultState() {
        return defaultState;
    }

    public void setDefaultState(boolean defaultState) {
        this.defaultState = defaultState;
    }
}
