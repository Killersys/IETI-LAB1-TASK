package Lab1.Lab1.dto;

import Lab1.Lab1.tyDa.Status;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

public class TaskDto {
    private String name;
    private String description;
    private Status status;
    private String assignedTo;
    private String dueDate;
    @JsonFormat(shape= JsonFormat.Shape.STRING,pattern = "YYYY-MM-DD")
    private Date created;

    public TaskDto(String name, String description, Status status, String assignedTo, String dueDate, Date created){
        this.name= name;
        this.description= description;
        this.status= status;
        this.assignedTo= assignedTo;
        this.dueDate= dueDate;
        this.created= created;}
    public String getName(){
        return name;}
    public String getDescription() {
        return description;}
    public Status getStatus() {
        return status;}
    public String getAssignedTo() {
        return assignedTo;}
    public String getDueDate() {
        return dueDate;}
    public Date getCreated() {
        return created;}
    public void setName(String name) {
        this.name = name;}
    public void setDescription(String description) {
        this.description = description;}
    public void setStatus(Status status) {
        this.status = status;}
    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;}
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;}
    public void setCreated(Date created) {
        this.created = created;}
}

