package models;

import java.util.Objects;

/** Объект тикета */
public class Ticket {

    /** Название проблемы */
    private String title;
    private Integer queue;
    private Integer status;
    private Integer priority;
    private String description;
    private String due_date;
    private String submitter_email;
    private Integer kbitem;
    private String assigned_to;

    // todo: остальные поля необходимые для заполнения тикета

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getQueue() {
        return queue;
    }

    public void setQueue(Integer queue) {
        this.queue = queue;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public String getSubmitter_email() {
        return submitter_email;
    }

    public void setSubmitter_email(String submitter_email) {
        this.submitter_email = submitter_email;
    }

    public Integer getKbitem() {
        return kbitem;
    }

    public void setKbitem(Integer kbitem) {
        this.kbitem = kbitem;
    }

    public String getAssigned_to() {
        return assigned_to;
    }

    public void setAssigned_to(String assigned_to) {
        this.assigned_to = assigned_to;
    }

    // todo: методы get и set для остальных полей

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return title.equals(ticket.title) &&
                queue.equals(ticket.queue) &&
                Objects.equals(status, ticket.status) &&
                Objects.equals(priority, ticket.priority) &&
                Objects.equals(description, ticket.description) &&
                Objects.equals(due_date, ticket.due_date) &&
                Objects.equals(submitter_email, ticket.submitter_email) &&
                Objects.equals(kbitem, ticket.kbitem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, queue, status, priority, description, due_date, submitter_email, kbitem);
    }


    // todo: equals и hashCode
}
