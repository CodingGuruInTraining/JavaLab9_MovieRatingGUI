package com.mark;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by hl4350hb on 3/29/2017.
 */
public class MovieRatingGUI extends JFrame {
    private JPanel rootPanel;
    private JComboBox<String> movieRatingComboBox;
    private JTextField movieNameTextField;
    private JButton submitButton;

    protected MovieRatingGUI() {
        this.setContentPane(rootPanel);

        configureRatings();
        configureButton();

        getRootPane().setDefaultButton(submitButton);

        pack();
        setVisible(true);

    }

    private void configureRatings() {
        for (int x = 1; x <= 5; x++) {
            if (x == 1) {
                movieRatingComboBox.addItem(x + " stars");
            } else {
                movieRatingComboBox.addItem(x + " stars");
            }
        }
    }

    private void configureButton() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String movieName = movieNameTextField.getText();
                String rating = (String)movieRatingComboBox.getSelectedItem();

                String result = "You gave " + movieName + " " + rating;
                JOptionPane.showMessageDialog(MovieRatingGUI.this, result);
            }
        });
    }
}
