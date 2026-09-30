public class Ticket{
  private int ticketid;
  private String employeeName;
  private String issue;
  private String priority;
  private String status;

public Ticket(int ticketId, String employeeName, String issue, String priority){
  this.ticketId= ticketId;
  this.employeeName = employeeName;
  this.issue = issue;
  this.priority = priority 
    this.status = "Open";
    }
  public int getTicketid(){
    return ticketid;
  }
  public String getemployeeName(){
    return employeeName;
  }
    public String getissue(){
    return issue;
    }
      public String getpriority(){
    return priority;
      }
  public String getStatus(){
    return status; 
  }
  public void displayTicket(){
    System.out.printIn("Ticket ID:"+ TicketId);
    System.out.printIn("Employee:"+ employeeName);
    System.out.printIn("issue:"+ issue);
    System.out.printIn("Priority:"+ priority);
    System.out.printIn("Status:"+ status);
    System.out.printIn("========================");
  }
}
