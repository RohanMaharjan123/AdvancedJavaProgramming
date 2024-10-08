# GUI Program displays Dropdown menu for selcetion one option from pool of multiple options

**Name**: GUI Program displays Dropdown menu for selcetion one option from pool of multiple options

**Date**: August 17th, 2024

## Source Code

```java
package QuestionNo4;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ItemEvent;
import java.awt.Dimension;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DropdownGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ComboBox Demo");
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constr = new GridBagConstraints();

        // Making Label and ComboBox
        JLabel lb1 = new JLabel("Which language you like most? ");
        String arr[] = { "C", "Java", "Python", "C++", "Dot Net" };
        JComboBox<String> combo = new JComboBox<String>(arr);

        // Increase the size of the ComboBox
        combo.setPreferredSize(new Dimension(200, 30));

        // Counting the num of items in the ComboBox
        String res = "Count : " + combo.getItemCount();
        JLabel count = new JLabel(res);

        // Printing the Selected item
        String res1 = "Selected item : " + combo.getSelectedItem();
        JLabel selected = new JLabel(res1);

        // Adding an ItemListener to update the selected item label
        combo.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                selected.setText("Selected item : " + combo.getSelectedItem());
            }
        });

        // Making the last item selected at first
        combo.setSelectedIndex(combo.getItemCount() - 1);

        // this aligns the count adn selected choose to left
        constr.fill = GridBagConstraints.HORIZONTAL;
        // Adding components to the main panel using GridBagConstraints
        constr.gridx = 0;
        constr.gridy = 0;
        constr.insets = new Insets(0, 0, 30, 0);
        mainPanel.add(lb1, constr);

        constr.gridx = 1;
        constr.gridy = 0;
        // constr.insets = new Insets(0, 0, 10, 0);
        mainPanel.add(combo, constr);

        constr.gridx = 0;
        constr.gridy = 1;
        constr.insets = new Insets(0, 0, 10, 0);
        mainPanel.add(count, constr);

        constr.gridx = 0;
        constr.gridy = 2;
        mainPanel.add(selected, constr);

        frame.add(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
```

## Output after Compiling

![GUI Program displays Dropdown menu for selcetion one option from pool of multiple options](./output.png)

## Output after Compiling with selected item at first or user selects as per their choice

![GUI Program displays Dropdown menu for selcetion one option from pool of multiple options](./output0.png)
