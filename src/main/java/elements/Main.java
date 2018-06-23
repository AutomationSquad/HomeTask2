package elements;

import interfaces.IScrollable;
import interfaces.IVisible;

public class Main {

    public static void main(String[] args) {
        //Button
        Button buttonObject = new Button();
        System.out.println(buttonObject.title + " parameters are:" +
                "\n1. Title - " + buttonObject.title +
                "\n2. Width x Height - " + buttonObject.width + " x " + buttonObject.height +
                "\n3. Color - " + buttonObject.color);
        buttonObject.click();
        buttonObject.move(3);
        buttonObject.hide();
        System.out.println("");

        Button buttonObject1 = new Button("OK", 10, 3);
        System.out.println(buttonObject1.title + " parameters are:" +
                "\n1. Title - " + buttonObject1.title +
                "\n2. Width x Height - " + buttonObject1.width + " x " + buttonObject1.height +
                "\n3. Color - " + buttonObject1.color);
        buttonObject1.click();
        buttonObject1.move(10);
        System.out.println("");

        //Checkbox
        Checkbox checkboxObject = new Checkbox("Include inactive");
        System.out.println(checkboxObject.title + " parameters are:" +
                "\n1. Title - " + checkboxObject.title +
                "\n2. Width x Height - " + checkboxObject.width + " x " + checkboxObject.height);
        checkboxObject.visible();
        checkboxObject.hide();
        System.out.println("");

        //Text Area
        IVisible textAreaObject = new TextArea("Lorem Ipsum");
        textAreaObject.visible();
        System.out.println("Background color for " + ((TextArea) textAreaObject).text + " is " + ((TextComponent) textAreaObject).backgroundColor);
        System.out.println("");

        //Text Field
        TextComponent textFieldObject = new TextComponent();
        System.out.println("Text Field font size is " + textFieldObject.fontSize);
        TextField textFieldObject1 = new TextField();
        System.out.println("Text Field font size is " + textFieldObject1.fontSize);
        System.out.println("");

        //Label
        Label labelObject = new Label("Label");
        System.out.println(labelObject.title + " parameters are:" +
                "\n1. Title - " + labelObject.title +
                "\n2. Width x Height - " + labelObject.width + " x " + labelObject.height);
        labelObject.visible(5);
        System.out.println("");

        //Container
        Container containerObject = new Container("Container", true);
        containerObject.rotate();
        containerObject.move(66);
        System.out.println("");
        Panel panelObject = new Panel();
        System.out.println(panelObject.title + " parameters are: " +
                "\n1. Transparency - " + panelObject.transparent +
                "\n2. Width x Height - " + panelObject.width + " x " + panelObject.height);
        panelObject.move();
        System.out.println("");

        //Window
        Window windowObject = new Window();
        windowObject.close();
        windowObject.hide(10);
        System.out.println(windowObject.select() + " is selected");
        System.out.println(windowObject.title + " has border - " + windowObject.borderExists + "\n" + windowObject.title + " is transparent - " + windowObject.transparent);
        IScrollable windowObject2 = new Window();
        windowObject2.scroll(false);
        System.out.println("");

        //Label
        Label welcome = new Label("Welcome!");
        Button close = new Button("Close", 10, 5);
        Button contact = new Button("Contact", 10, 5);
        TextArea aboutUs = new TextArea("Huston Animal Shelter is a non-profit organization established by a local city community in 2004." +
                "\nSince that time we've became a home for thousands of animals. As of today we are operating two large shelter locations." +
                "\nWe encourage everyone to come and see our animals. You might find your best friend here." +
                "\nYou are welcome to stop by the following addresses. We are always happy to see you." +
                "\nTo volunteer or provide other type of support, please click the " + contact.title + " button");
        Applet appletObject = new Applet("Animal Shelter", welcome, aboutUs, contact, close);
        appletObject.printPage();
        System.out.println("");

        //Frame
        Frame frameObject = new Frame("Our pets", false, true);
        System.out.println(frameObject.select());
        System.out.println("");

        //Text Area
        TextArea text = new TextArea("...Enter your message here...");
        Checkbox callback = new Checkbox("Call me back");
        Button submit = new Button();
        Dialog dialogObject = new Dialog("Contact Us", text, callback, submit, close);
        dialogObject.printPage();
        System.out.println("");

        //Checkbox Group
        CheckboxGroup checkboxGroupObject = new CheckboxGroup("Huston region");
        checkboxGroupObject.click();
    }
}
