public class TestEditor {
	public static void main(String[] args) {
	DocumentInvoker myDocument = new DocumentInvoker ("callmemaybe");
	/* myDocument.Write("Hey I just met you");
	 myDocument.Write("And this is crazy");
	 myDocument.Write("But here’s my number");
	 myDocument.Write("So call me maybe");
     // - UNCOMMENT -
     myDocument.Erase("And this is crazy");
     myDocument.Undo();
     // - END -
     myDocument.Bold(1); 
	 System.out.println(myDocument.Read());
	 myDocument.printCommandBuffer();
	*/
	 
	 // -- Multi-level Undo Redo test Common Code --
	 myDocument.Write("Hey I just met you");
	 myDocument.Write("And this is crazy");
	 myDocument.Write("But here’s my number");
	 // -- END --
	 
	 // -- Multi-level Undo Redo test --
	 //myDocument.Undo(0);
	 //System.out.println(myDocument.Read());
	 // -- END --
	 
	 // -- Multi-level Undo Redo test 2 --
	 myDocument.Undo(2);
	 System.out.println(myDocument.Read());
	}
//	 myDocument.Erase("So call me maybe");
//	 System.out.println(myDocument.Read());
//	 myDocument.Write("So call me maybe?");
//	// myDocument.Undo();
//	 System.out.println(myDocument.Read());
//	}
}
