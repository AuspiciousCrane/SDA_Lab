import java.util.ArrayList;

public class Document {
private ArrayList<String> textArray;
private String name;
	 public Document(String name) {
	 this.name=name;	 
	 textArray = new ArrayList<String>();
	 }
public Integer Write(String text)
{
    textArray.add(text);
    return textArray.size() - 1;
}

	public void WriteAt(Integer index, String text) {
		textArray.add(index, text);
	}
public Integer Erase(String text)
{
	Integer removeIndex = textArray.indexOf(text);
    textArray.remove(text);
    return removeIndex;
}
public void Bold(int number) {
	StringBuffer txt = new StringBuffer();
	txt.append("<b>"+ textArray.get(number) + "</b>");
	textArray.set(number, txt.toString());
}

public void RemoveBold(int number) {
	String txt =  (String) textArray.get(number);
	txt = txt.substring(3, txt.length()-4);
	textArray.set(number, txt);
	System.out.println(txt.toString());
}

public void Erase(int number)
{
    textArray.remove(number);
}

public String Read() {
	StringBuffer txt = new StringBuffer();
	txt.append("---- Contents of: " + name + " ----\n");
	for (int i = 0; i < textArray.size(); i++) {
		txt.append( i +":"+ (String ) textArray.get(i) + "\n");
	}
	return txt.toString();
	}
}