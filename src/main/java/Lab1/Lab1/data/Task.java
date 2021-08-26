package Lab1.Lab1.data;

import Lab1.Lab1.tyDa.Status;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Task {
    private String id;
    private String name;
    private String description;
    private Status status;
    private String assignedTo;
    private String dueDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "YYYY-MM-DD")
    private Date created;

    public Task(String id, String name,String description,Status status, String assignedTo, String dueDate, Date date){
        this.id= id;
        this.name= name;
        this.description= description;
        this.status=status;
        this.assignedTo=assignedTo;
        this.dueDate=dueDate;
        this.created=created;}
    public String getId(String id){
        this.id=id;}
    public String getName() {
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
    public void setId(String id) {
        this.id = id;}
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
