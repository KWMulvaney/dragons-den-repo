package den.dragon;

import de.vandermeer.asciitable.v2.RenderedTable;
import de.vandermeer.asciitable.v2.V2_AsciiTable;
import de.vandermeer.asciitable.v2.render.V2_AsciiTableRenderer;
import de.vandermeer.asciitable.v2.render.WidthFixedColumns;
import de.vandermeer.asciitable.v2.row.ContentRow;

public class TablePlayTime {

    public RenderedTable generateTable(int starthour) {
        V2_AsciiTable at = new V2_AsciiTable();// creating a table
        char[] alignText = new char[14]; // aligns columns
        for (int i = 0; i < 14; i++) {
            alignText[i] = 'c';
        }
        at.addRule(); // adding a ruler line / border/ separator for the top row
        ContentRow row = generateHeader(at, alignText, starthour);
        row.setAlignment(alignText);// centres all headers
        at.addRule(); // add separator between header and table
        row = at.addRow(null, "BBC One", null, null, null, null, null, null, null, "Breakfast", null, null, null,
                "Saturday Kitchen");
        row.setAlignment(alignText);
        row = at.addRow(null, "BBC Two", null, null, null, "Ray Harryhausen ...", null, null, null, "Natural World ",
                null, null, null, "Secret Britain");
        row.setAlignment(alignText);
        row = at.addRow(null, "ITV One", null, "Advent..", null, null, null, null, null, null, null, null, null,
                "Carry on Girls (1973)");
        row.setAlignment(alignText);
        row = at.addRow(null, "Channel 4", null, "Frasier", null, "Frasier", null, null, null, "The Morning Line", null,
                "The Big Bang Theory", null, "The Big Bang Theory");
        row.setAlignment(alignText);
        at.addRule();
        V2_AsciiTableRenderer rend = new V2_AsciiTableRenderer();// creates a printable table
        WidthFixedColumns colwidths = new WidthFixedColumns(); // creates fixed size columns for the table
        for (int i = 0; i < 14; i++) {// later will become method
            colwidths.add(6);
        }
        rend.setWidth(colwidths);
        RenderedTable rt = rend.render(at);
        return rt;
    }

    public ContentRow generateHeader(V2_AsciiTable at, char[] alignText, int starthour) {
        if (starthour > 21 || starthour < 0) {
            throw new IllegalArgumentException("time is out of bounds must be 0 to 21. It was " + starthour);
        }
        String firstTimeRange = calculateTimeRange(starthour);
        String secondTimeRange = calculateTimeRange(starthour + 1);
        String thirdTimeRange = calculateTimeRange(starthour + 2);

        return at.addRow(null, "Channel", null, null, null, firstTimeRange, null, null, null, secondTimeRange, null,
                null, null, thirdTimeRange);// creates header row
    }

    private String calculateTimeRange(int starthour) {
        return String.format("%02d00 - %02d00", starthour, starthour + 1);
    }

    // when creating a row the nulls allow column spanning - will add method to insert nulls!
    public static void main(String[] args) {
        TablePlayTime tableGenerator = new TablePlayTime();
        RenderedTable rt = tableGenerator.generateTable(21);
        System.out.println(rt); // prints the table
    }

}
