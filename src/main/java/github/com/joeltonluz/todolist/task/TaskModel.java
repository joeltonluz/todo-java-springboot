package github.com.joeltonluz.todolist.task;


import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_tasks")
public class TaskModel {

  @Id
  @GeneratedValue(generator = "UUID")
  private UUID id;

  public String description;

  @Column(length =  50)
  public String title;
  public LocalDateTime startAt;
  public LocalDateTime endAt;
  public String priority;

  private UUID idUser;

  @CreationTimestamp
  private LocalDateTime createdAt;
}