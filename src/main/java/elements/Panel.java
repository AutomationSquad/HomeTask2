package elements;

public class Panel extends Container {

    private String titlePanel;

    public String getTitlePanel() {
        return titlePanel;
    }

    public void setTitlePanel(String titlePanel) {
        this.titlePanel = titlePanel;
    }

    void checkTitle() {

        System.out.println("Panel title is " + titlePanel);
    }

}
