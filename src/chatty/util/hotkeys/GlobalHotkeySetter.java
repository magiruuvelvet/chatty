
package chatty.util.hotkeys;

import java.util.logging.Logger;
import javax.swing.KeyStroke;

/**
 * JKeymaster (JNA) global hotkey handling.
 * 
 * @author tduva
 */
public class GlobalHotkeySetter {
    
    private static final Logger LOGGER = Logger.getLogger(GlobalHotkeySetter.class.getName());
    
    private final GlobalHotkeySetter.GlobalHotkeyListener listener;
    
    private String error = "Global hotkey error";
    private boolean anyRegistered;
    
    public GlobalHotkeySetter(GlobalHotkeySetter.GlobalHotkeyListener listener) {
        this.listener = listener;
    }
    
    /**
     * Returns an error message if an error occured while initializing.
     * 
     * @return The error message, or null if no error occured
     */
    public String getError() {
        return error;
    }
    
    /**
     * Whether the global hotkey provider has been initialized and is still
     * active. If false, then more information may be retrieved with
     * {@link #getError() getError}, unless the provider was intentionally
     * stopped.
     * 
     * @return true if global hotkeys can be added, false otherwise
     */
    public boolean isActive() {
        return false;
    }
    
    /**
     * Sets a hotkey with the given id.
     * 
     * @param hotkeyId Used in the listener to notify about a hotkey press
     * @param keyStroke The hotkey to register (some key codes may not work
     * depending on the system)
     */
    public void registerHotkey(Object hotkeyId, KeyStroke keyStroke) {
    }
    
    /**
     * Removes all registered hotkeys.
     */
    public void unregisterAllHotkeys() {
    }
    
    /**
     * Free up any ressources if necessary. This object can no longer be used
     * afterwards.
     */
    public void cleanUp() {
    }
    
    public interface GlobalHotkeyListener {
        public void onHotkey(Object hotkeyId);
    }
    
}
