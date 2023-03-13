 

import javax.swing.*;
import javax.swing.table.*;
import java.util.Vector;
import java.util.*;
import java.io.*;

public class ScheduleTableModel extends DefaultTableModel {

    // DefaultTableModel uses:
    // - a Vector of column identifiers
    // - a Vector of Vectors of Object values
    // This fact is reflected by the Memento class.
    TableMemento memento;
 
    // Value object.
    //
    public class TableMemento implements java.io.Serializable {

        private List columnIdentifiers;
        private List dataList;

        // Package visibility to only allow access for
        // the Originator.
        // We receive from the TableModel:
        // - a Vector of column identifiers
        // - a Vector of Vectors of Object values (assumption: Strings)

        TableMemento(Vector columnIdentifiers, Vector dataVector)
        {
        // COMPLETE.
            this.columnIdentifiers = columnIdentifiers;
            this.dataList = dataVector;
        }

        // Package visibility to only allow access for
        // the Originator.
        Vector getColumnIdentifiers()
        {
        // COMPLETE.
            return (Vector) this.columnIdentifiers;
        }

        Vector getDataVector()
        {
        // COMPLETE.
            return (Vector) this.dataList;
        }

        public String toString() {
        return "[ci=" + columnIdentifiers.toString() + "\n" +
            "dl=" + dataList.toString() + "]";
        }

        // Other private (static) helper methods.
        // COMPLETE if necessary.

    }


    public ScheduleTableModel(Object[][] data, Object[] columnNames)
    {
	super(data, columnNames);
    }

    public TableMemento createMemento()
    {
	// COMPLETE.
        // -- Custom Code --
        Vector tableData = new Vector(this.dataVector);
        Vector tableColumnIdentifiers = new Vector(this.columnIdentifiers);

        this.memento = new TableMemento(tableColumnIdentifiers, tableData);
        serializeMemento(null);
        return this.memento;
    }

    public void serializeMemento(String fileName) {
        try {
            String fn = (fileName == null) ? "memento.txt" : fileName;
            FileOutputStream fos = new FileOutputStream(fn);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.memento);
        } catch (Exception e) {
            System.out.println("Failed to Serialize Memento");
        }
    }

    private void setMemento(TableMemento memento)
    {
	// COMPLETE.
        this.memento = memento;
        setDataVector(memento.getDataVector(), memento.getColumnIdentifiers());
        serializeMemento(null);
    }

    public void deserializeMemento(String fileName) {
        try {
            String fn = (fileName == null) ? "memento.txt" : fileName;
            FileInputStream fis = new FileInputStream(fn);
            ObjectInputStream ois = new ObjectInputStream(fis);
            TableMemento tableMemento = (TableMemento) ois.readObject();
            this.setMemento(tableMemento);
        } catch(Exception e) {
            System.out.println("Failed to deserialize Memento");
        }
    }
}
