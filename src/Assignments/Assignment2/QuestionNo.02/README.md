# GUI Program displays four buttons and changes two button texts to word from number. 

**Name**: GUI Program displays four buttons and changes two button texts to word from number. 

**Date**: August 13th, 2024

## Source Code

```java
package QuestionNo2;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class fourbuttons {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Label Demo");
        JPanel panel = new JPanel(new GridLayout(2, 2));

        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");

        b1.setText("One");
        b3.setText("Three");
        b2.setEnabled(false);
        b4.setEnabled(false);

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
```

## Output

![GUI Program displays four buttons and changes two button texts to word from number.](./output.png)
