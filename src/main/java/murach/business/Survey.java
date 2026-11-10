package murach.business;

import java.io.Serializable;


public class Survey implements Serializable {
    private String method;
    private String [] yes;
    private String contact;

    public Survey() {
        method = "";
        yes = new String[0];
        contact = "";
    }

    public Survey (String method, String [] yes, String contact) {
        if (method == null || method.isEmpty()) {
            this.method = "NO";
        } else {
            this.method = method;
        }
        if (yes == null) {
            this.yes = new String[0];
        } else {
            this.yes = yes;
        }
        if (contact == null || contact.isEmpty()) {
            this.contact = "NO";
        } else {
            this.contact = contact;
        }
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String [] getYes() {
        return yes;
    }

    public String getFirstYes() {
        return yes != null && yes.length > 0 ? yes[0] : "NO";
    }

    public String getSecondYes() {
        return yes != null && yes.length > 1 ? yes[1] : "";
    }

    public void setYes(String [] yes) {
        this.yes = yes;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
