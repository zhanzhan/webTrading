package jsf;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.logging.Logger;

/**
 *
 * @author Stanley
 * @since 180828
 */
@Named(value = "bean1")
@SessionScoped
public class Bean1 implements Serializable {

    private static final Logger LOGGER = Logger.getLogger(Bean1.class.getName());
    

    private String batchNumber;
    private String inputFileName;

    public Bean1() {
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getInputFileName() {
        return inputFileName;
    }

    public void setInputFileName(String inputFileName) {
        this.inputFileName = inputFileName;
    }

    
}
