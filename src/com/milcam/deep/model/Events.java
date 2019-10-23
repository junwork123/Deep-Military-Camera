package com.milcam.deep.model;

public class Events {

    public static class EventAlert {

        private String message;

        public EventAlert(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

}