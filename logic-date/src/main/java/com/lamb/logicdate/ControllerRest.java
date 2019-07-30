package com.lamb.logicdate;

import java.io.Serializable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ControllerRest
 */
@RestController
public class ControllerRest {

    @RequestMapping(path = "/api/date", method= RequestMethod.GET)
    public Response getDate() {
        return new Response(new LogicDate());
    }
    //inner class
    
    class Response implements Serializable {
        private static final long serialVersionUID = 1L;
        private LogicDate date;

        public Response(LogicDate date) {
            this.date = date;
        }

        /**
         * @param date the date to set
         */
        public void setDate(LogicDate date) {
            this.date = date;
        }

        public LogicDate getLogicDate() {
            return this.date;
        }
    }



}