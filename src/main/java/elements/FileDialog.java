package elements;

import interfaces.IScrollable;
import interfaces.ISelectable;

public class FileDialog extends Dialog implements ISelectable, IScrollable{
    public FileDialog(String name, Button closeButton, Button collapseButton, Button expandButton) {
        super(name, closeButton, collapseButton, expandButton);
    }

    public void uploadFiles(Button uploadButton){
        System.out.println("Select file to  be uploaded");
        uploadButton.clickOnButton();
    }

    @Override
    public void select() {
        System.out.println(name + " is selected!");
    }
}
