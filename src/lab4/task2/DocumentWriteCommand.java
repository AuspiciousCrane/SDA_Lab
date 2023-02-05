
public class DocumentWriteCommand implements Command {

	private Document editableDoc;
    private String text;
    private Integer writeIndex;
    private boolean undone = false;

    public DocumentWriteCommand(Document doc, String text)
    {
        this.editableDoc = doc;
        this.text = text;
        writeIndex = editableDoc.Write(text);
    }
	
	public void undo() {
		editableDoc.Erase(writeIndex);
	}
	
	public void redo() {
		if (!undone) {
			return;
		}
		editableDoc.WriteAt(writeIndex, text);
	}
	public String toString(){
		return "Write";
	}
}
