import java.util.ArrayList;

public class DocumentEraseCommand implements Command {

	private Document editableDoc;
    private String text;
    private Integer eraseIndex;
    private boolean undone = false;

    public DocumentEraseCommand(Document doc, String text)
    {
        this.editableDoc = doc;
        this.text = text;
        eraseIndex = editableDoc.Erase(text);
    }
	
	public void undo() {
		editableDoc.WriteAt(eraseIndex, text);
		this.undone = true;
	}
	
	public void redo() {
		if (!undone) {
			return;
		}
		editableDoc.Erase(eraseIndex);
	}
	public String toString(){
		return "Erase";
	}
	
	public Integer getEraseIndex() {
		return eraseIndex;
	}

}
