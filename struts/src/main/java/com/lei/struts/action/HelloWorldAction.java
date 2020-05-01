package com.lei.struts.action;

import com.lei.struts.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 学习
 *
 * @author: leiwe
 * @date 2020-04-10 14:20
 */
public class HelloWorldAction extends ActionSupport {
    private static final long serialVersionUID = 1L;


    /**
     * The model class that stores the message
     * to display in the view.
     */
    private MessageStore messageStore;

    /*
     * Creates the MessageStore model object and
     * returns success.  The MessageStore model
     * object will be available to the view.
     * (non-Javadoc)
     * @see com.opensymphony.xwork2.ActionSupport#execute()
     */
    public String execute() {
        messageStore = new MessageStore() ;

        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
}
