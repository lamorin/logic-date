package com.lamb.logicdate;

import java.io.Serializable;

/**
 * LogicDate
 */

public class LogicDate implements Serializable {
    private static final long serialVersionUID = 1L;
    private String logic = "2000";
    private String real = "2019";

    @Override
    public String toString() {
        return "date";
    }

    /**
     * @return String return the logic
     */
    public String getlogic() {
        return logic;
    }

    /**
     * @param logic the logic to set
     */
    public void setLogic(String logic) {
        this.logic = logic;
    }

    /**
     * @return String return the realDate
     */
    public String getReal() {
        return real;
    }

    /**
     * @param realDate the realDate to set
     */
    public void setRealDate(String real) {
        this.real = real;
    }

}