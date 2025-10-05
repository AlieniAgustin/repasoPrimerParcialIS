package djview;

public class BeatControllerV2 extends BeatController {

   public BeatControllerV2(BeatModelInterface model) {
      this.model = model;
		  view = new DJViewV2(this, model);
      view.createView();
      view.createControls();
		  view.disableStopMenuItem();
		  view.enableStartMenuItem();
		  model.initialize();
   }

}
