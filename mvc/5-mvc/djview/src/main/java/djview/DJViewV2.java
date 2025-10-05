package djview;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DJViewV2 extends DJView {
    public DJViewV2(ControllerInterface controller, BeatModelInterface model) {
        super(controller, model);
    }

    @Override
    public void createView() {
        super.createView();
        model.setBPM(60); 
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == setBPMButton) {
            int bpm = 60;
            String bpmText = bpmTextField.getText();
            if (bpmText != null && !bpmText.isEmpty()) {
                bpm = Integer.parseInt(bpmText);
            }
            controller.setBPM(bpm);
        } 
        // ahora los botones multiplican/dividen por 2
        else if (event.getSource() == increaseBPMButton) {
            controller.doubleBPM();
        } else if (event.getSource() == decreaseBPMButton) {
            controller.halveBPM();
        }
    }
}
