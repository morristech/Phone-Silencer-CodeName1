package userclasses;

import generated.StateMachineBase;
import com.codename1.ui.*;
import com.codename1.ui.events.*;
import com.codename1.ui.util.Resources;
import com.codename1.ui.util.UIBuilder;
import com.codename1.ui.spinner.TimeSpinner;

/**
 *
 * @author LaSpina
 */
public class StateMachine extends StateMachineBase {

   boolean phoneSleepEnabled = true;

   public StateMachine(String resFile) {
      super(resFile);
      // do not modify, write code in initVars and initialize class members there,
      // the constructor might be invoked too late due to race conditions that might occur
   }

   /**
    * this method should be used to initialize variables instead of the
    * constructor/class scope to avoid race conditions
    */
   protected void initVars(Resources res) {
      //This method can not reference the UI because it is called before the UI is initialzied.
   }

   @Override
   protected void onMain_ButtonAction(Component c, ActionEvent event) {
      phoneSleepEnabled = !phoneSleepEnabled;
      System.out.println(c); //proves that the parameter is the calling object (button)
      Button thisButton = (Button) c;
      thisButton.setWidth(400);
      if (phoneSleepEnabled)
         thisButton.setText("Running");
      else
         thisButton.setText("Disabled");
   }

    @Override
    protected void onCreateMain() {
    
    }

    @Override
    protected void postMain(Form f) {
      TimeSpinner timePicker = findTimeSpinner();
      //note that this method was auto-generated in the StateMachineBase class.
      if (timePicker != null) {
         timePicker.setCurrentHour(7);
         timePicker.setCurrentMinute(30);
      }
    
    }
}
