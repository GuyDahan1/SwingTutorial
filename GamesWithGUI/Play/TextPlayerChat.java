package Play;

import javax.swing.*;
import java.awt.*;

public class TextPlayerChat extends JTextField {
    public TextPlayerChat()
    {
        super("Enter text here.. ");
        Dimension dim = getPreferredSize();
        dim.width=250;
        dim.height=30;
        setPreferredSize(dim);
    }


}
